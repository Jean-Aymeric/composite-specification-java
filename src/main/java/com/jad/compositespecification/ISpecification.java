package com.jad.compositespecification;

/**
 * The interface Specification.
 *
 * @param <E> the type parameter
 */
public interface ISpecification<E> {

    /**
     * Is satisfied by boolean.
     *
     * @param e the e
     * @return the boolean
     */
    boolean isSatisfiedBy(E e);

    /**
     * Or specification.
     *
     * @param specifications the specifications
     * @return the specification
     */
    @SuppressWarnings("unchecked")
    ISpecification<E> or(final ISpecification<E>... specifications);

    /**
     * Xor specification.
     *
     * @param specifications the specifications
     * @return the specification
     */
    @SuppressWarnings("unchecked")
    ISpecification<E> xor(final ISpecification<E>... specifications);

    /**
     * And specification.
     *
     * @param specification the specification
     * @return the specification
     */
    @SuppressWarnings("unchecked")
    ISpecification<E> and(final ISpecification<E>... specification);

    /**
     * Not specification.
     *
     * @return the specification
     */
    ISpecification<E> not();

    /**
     * Gets description.
     *
     * @return the description
     */
    String getDescription();
}