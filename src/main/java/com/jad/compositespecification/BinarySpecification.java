package com.jad.compositespecification;

/**
 * The type Binary specification.
 *
 * @param <E> the type parameter
 */
public abstract class BinarySpecification<E> extends NArySpecification<E> {
    /**
     * The Left.
     */
    protected final Specification<E> left;
    /**
     * The Right.
     */
    protected final Specification<E> right;

    /**
     * Instantiates a new Binary specification.
     *
     * @param description the description
     * @param left        the left specification
     * @param right       the right specification
     */
    public BinarySpecification(final String description, final Specification<E> left, final Specification<E> right) {
        super(description, left, right);
        this.left = left;
        this.right = right;
    }

    /**
     * Is satisfied by boolean.
     *
     * @param isSatisfiedByLeft  the is satisfied by left
     * @param isSatisfiedByRight the is satisfied by right
     * @return the boolean
     */
    protected abstract boolean isSatisfiedBy(final boolean isSatisfiedByLeft, final boolean isSatisfiedByRight);
}