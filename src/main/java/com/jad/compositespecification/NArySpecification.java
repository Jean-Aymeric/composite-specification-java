package com.jad.compositespecification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The type N ary specification.
 *
 * @param <E> the type parameter
 */
abstract class NArySpecification<E> extends AbstractSpecification<E> {

    private final ArrayList<ISpecification<E>> specifications = new ArrayList<>();

    /**
     * Instantiates a new N ary specification.
     *
     * @param description    the description
     * @param specifications the specifications
     */
    @SafeVarargs
    public NArySpecification(final String description, final ISpecification<E>... specifications) {
        super(description);
        this.specifications.addAll(Arrays.asList(specifications));
    }

    /**
     * Instantiates a new N ary specification.
     *
     * @param description    the description
     * @param specifications the specifications
     */
    protected NArySpecification(final String description, final ArrayList<ISpecification<E>> specifications) {
        super(description);
        this.specifications.addAll(specifications);
    }

    @Override
    public final boolean isSatisfiedBy(final E e) {
        final ArrayList<Boolean> isSatisfiedBy = new ArrayList<>();
        for (final ISpecification<E> specification : this.specifications) {
            isSatisfiedBy.add(specification.isSatisfiedBy(e));
        }
        return this.isSatisfiedBy(isSatisfiedBy);
    }

    @Override
    public String getDescription() {
        return this.description + "(" + this.specifications.stream().map(ISpecification::getDescription).collect(Collectors.joining(", ")) + ")";
    }

    /**
     * Is satisfied by boolean.
     *
     * @param isSatisfiedBy the is satisfied by
     * @return the boolean
     */
    protected abstract boolean isSatisfiedBy(final ArrayList<Boolean> isSatisfiedBy);
}