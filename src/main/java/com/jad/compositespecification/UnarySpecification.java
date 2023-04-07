package com.jad.compositespecification;

/**
 * The type Unary specification.
 *
 * @param <E> the type parameter
 */
public abstract class UnarySpecification<E> extends CompositeSpecification<E> {

    private final Specification<E> specification;

    /**
     * Instantiates a new Unary specification.
     *
     * @param specification the specification
     */
    public UnarySpecification(final String description, Specification<E> specification) {
        super(description);
        this.specification = specification;
    }

    /**
     * Gets specification.
     *
     * @return the specification
     */
    protected final Specification<E> getSpecification() {
        return specification;
    }

    @Override
    public final String toString() {
        return this.getDescription() + "(" + this.getSpecification().toString() + ")";
    }
}