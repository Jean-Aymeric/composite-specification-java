package com.jad.compositespecification;

import java.util.ArrayList;

/**
 * The type X or specification.
 *
 * @param <E> the type parameter
 */
class XOrSpecification<E> extends NArySpecification<E> {

    /**
     * Instantiates a new X or specification.
     *
     * @param specifications the specifications
     */
    @SafeVarargs
    public XOrSpecification(final Specification<E>... specifications) {
        super("^", specifications);
    }

    protected XOrSpecification(final ArrayList<Specification<E>> specifications) {
        super("^", specifications);
    }

    @Override
    protected boolean isSatisfiedBy(final ArrayList<Boolean> isSatisfiedBy) {
        boolean result = false;
        for (final boolean b : isSatisfiedBy) {
            if (b) {
                if (result) {
                    return false;
                }
                result = true;
            }
        }
        return result;
    }
}