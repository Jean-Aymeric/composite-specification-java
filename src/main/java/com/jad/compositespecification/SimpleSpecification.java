package com.jad.compositespecification;

/**
 * The type Simple specification.
 *
 * @param <E> the type parameter
 */
public abstract class SimpleSpecification<E> extends CompositeSpecification<E> {
    /**
     * Instantiates a new Simple specification.
     *
     * @param description the description
     */
    public SimpleSpecification(final String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return "<" + this.description + ">";
    }
}
