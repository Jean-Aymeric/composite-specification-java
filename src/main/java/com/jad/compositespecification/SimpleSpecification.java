package com.jad.compositespecification;

/**
 * The type Simple specification.
 *
 * @param <E> the type parameter
 */
public abstract class SimpleSpecification<E> extends CompositeSpecification<E> {
    public SimpleSpecification(final String description) {
        super(description);
    }

    @Override
    public final String toString() {
        return "<" + this.getDescription() + ">";
    }
}
