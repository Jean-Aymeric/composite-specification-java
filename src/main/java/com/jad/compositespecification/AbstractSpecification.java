package com.jad.compositespecification;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The type Composite specification.
 *
 * @param <E> the type parameter
 */
abstract class AbstractSpecification<E> implements ISpecification<E> {
    /**
     * The Description.
     */
    protected final String description;

    /**
     * Instantiates a new Composite specification.
     *
     * @param description the description
     */
    public AbstractSpecification(final String description) {
        this.description = description;
    }

    private ArrayList<ISpecification<E>> addThisToArray(final ISpecification<E>[] specification) {
        final ArrayList<ISpecification<E>> list = new ArrayList<>();
        list.add(this);
        list.addAll(Arrays.asList(specification));
        return list;
    }

    @SafeVarargs
    @Override
    public final ISpecification<E> or(final ISpecification<E>... specifications) {
        return new OrSpecification<>(this.addThisToArray(specifications));
    }

    @SafeVarargs
    @Override
    public final ISpecification<E> xor(final ISpecification<E>... specifications) {
        return new XOrSpecification<>(this.addThisToArray(specifications));
    }


    @SafeVarargs
    @Override
    public final ISpecification<E> and(final ISpecification<E>... specifications) {
        return new AndSpecification<>(this.addThisToArray(specifications));
    }

    @Override
    public final ISpecification<E> not() {
        return new NotSpecification<>(this);
    }

    @Override
    public abstract boolean isSatisfiedBy(E e);
}