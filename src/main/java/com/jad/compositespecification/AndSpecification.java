package com.jad.compositespecification;

import java.util.ArrayList;

/**
 * The type And specification.
 *
 * @param <E> the type parameter
 */
class AndSpecification<E> extends NArySpecification<E> {
    /**
     * Instantiates a new And specification.
     *
     * @param specifications the specifications
     */
    @SafeVarargs
    public AndSpecification(final Specification<E>... specifications) {
        super("&&", specifications);
    }

    protected AndSpecification(final ArrayList<Specification<E>> specifications) {
        super("&&", specifications);
    }

    @Override
    protected boolean isSatisfiedBy(final ArrayList<Boolean> isSatisfiedBy) {
        for (final boolean b : isSatisfiedBy) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}