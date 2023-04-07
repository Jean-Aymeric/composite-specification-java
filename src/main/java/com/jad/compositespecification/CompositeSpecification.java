package com.jad.compositespecification;

/**
 * The type Composite specification.
 *
 * @param <E> the type parameter
 */
abstract class CompositeSpecification<E> implements Specification<E> {
	private final String description;

	public CompositeSpecification(final String description) {
		this.description = description;
	}

	public CompositeSpecification() {
		this.description = this.getClass().getSimpleName();
	}

	@Override
	public final Specification<E> or(final Specification<E> specification) {
		return new OrSpecification<>(this, specification);
	}

	@Override
	public final Specification<E> xor(final Specification<E> specification) {
		return new XOrSpecification<>(this, specification);
	}

	@Override
	public final Specification<E> and(final Specification<E> specification) {
		return new AndSpecification<>(this, specification);
	}

	@Override
	public final Specification<E> not() {
		return new NotSpecification<>(this);
	}

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