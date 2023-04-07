package com.jad.compositespecification;

/**
 * The interface Specification.
 *
 * @param <E> the type parameter
 */
public interface Specification<E> {

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
     * @param specification the specification
     * @return the specification
     */
    Specification<E> or(final Specification<E> specification);

    /**
     * Xor specification.
     *
     * @param specification the specification
     * @return the specification
     */
    Specification<E> xor(final Specification<E> specification);

    /**
     * And specification.
     *
     * @param specification the specification
     * @return the specification
     */
    Specification<E> and(final Specification<E> specification);

    /**
     * Not specification.
     *
     * @return the specification
     */
    Specification<E> not();

}