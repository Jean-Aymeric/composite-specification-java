package com.jad.compositespecification;

import java.util.ArrayList;

/**
 * The type Or specification.
 *
 * @param <E> the type parameter
 */
class OrSpecification<E> extends NArySpecification<E> {

    /**
     * Instantiates a new Or specification.
     *
     * @param specifications the specifications
     */
    @SafeVarargs
    public OrSpecification(final ISpecification<E>... specifications) {
        super("||", specifications);
    }

    /**
     * Instantiates a new Or specification.
     *
     * @param specifications the specifications
     */
    protected OrSpecification(final ArrayList<ISpecification<E>> specifications) {
        super("||", specifications);
    }

    @Override
    protected boolean isSatisfiedBy(final ArrayList<Boolean> isSatisfiedBy) {
        for (final boolean b : isSatisfiedBy) {
            if (b) {
                return true;
            }
        }
        return false;
    }
}