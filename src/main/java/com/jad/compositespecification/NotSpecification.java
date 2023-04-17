package com.jad.compositespecification;

/**
 * The type Not specification.
 *
 * @param <E> the type parameter
 */
class NotSpecification<E> extends UnarySpecification<E> {

    /**
     * Instantiates a new Not specification.
     *
     * @param specification the specification
     */
    public NotSpecification(final Specification<E> specification) {
        super("!", specification);
    }

    @Override
    public final boolean isSatisfiedBy(final boolean isSatisfiedBy) {
        return !isSatisfiedBy;
    }
}
