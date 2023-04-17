package com.jad.compositespecification;

/**
 * The type Unary specification.
 *
 * @param <E> the type parameter
 */
public abstract class UnarySpecification<E> extends CompositeSpecification<E> {

    /**
     * The Specification.
     */
    protected final Specification<E> specification;

    /**
     * Instantiates a new Unary specification.
     *
     * @param description   the description
     * @param specification the specification
     */
    public UnarySpecification(final String description, final Specification<E> specification) {
        super(description);
        this.specification = specification;
    }

    @Override
    public final String toString() {
        return this.getDescription() + "(" + this.specification.toString() + ")";
    }

    @Override
    public final boolean isSatisfiedBy(final E e) {
        return this.isSatisfiedBy(this.specification.isSatisfiedBy(e));
    }

    /**
     * Is satisfied by boolean.
     *
     * @param isSatisfiedBy the is satisfied by
     * @return the boolean
     */
    protected abstract boolean isSatisfiedBy(boolean isSatisfiedBy);
}