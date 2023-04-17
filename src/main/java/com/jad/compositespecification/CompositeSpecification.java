package com.jad.compositespecification;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The type Composite specification.
 *
 * @param <E> the type parameter
 */
abstract class CompositeSpecification<E> implements Specification<E> {
    private final String description;

    /**
     * Instantiates a new Composite specification.
     *
     * @param description the description
     */
    public CompositeSpecification(final String description) {
        this.description = description;
    }

    /**
     * Instantiates a new Composite specification.
     */
    public CompositeSpecification() {
        this.description = this.getClass().getSimpleName();
    }

    private ArrayList<Specification<E>> addThisToArray(final Specification<E>[] specification) {
        final ArrayList<Specification<E>> list = new ArrayList<>();
        list.add(this);
        list.addAll(Arrays.asList(specification));
        return list;
    }

    @Override
    public final Specification<E> or(final Specification<E>... specifications) {
        return new OrSpecification<>(this.addThisToArray(specifications));
    }

    @Override
    public final Specification<E> xor(final Specification<E>... specifications) {
        return new XOrSpecification<>(this.addThisToArray(specifications));
    }


    @SafeVarargs
    @Override
    public final Specification<E> and(final Specification<E>... specifications) {
        return new AndSpecification<>(this.addThisToArray(specifications));
    }

    @Override
    public final Specification<E> not() {
        return new NotSpecification<>(this);
    }

    @Override
    public abstract boolean isSatisfiedBy(E e);

    /**
     * Gets description.
     *
     * @return the description
     */
    protected final String getDescription() {
        return this.description;
    }
}