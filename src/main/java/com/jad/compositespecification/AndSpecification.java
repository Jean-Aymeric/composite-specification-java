package com.jad.compositespecification;

/**
 * The type And specification.
 *
 * @param <E> the type parameter
 */
class AndSpecification<E> extends BinarySpecification<E> {

	/**
	 * Instantiates a new And specification.
	 *
	 * @param left  the left specification
	 * @param right the right specification
	 */
	public AndSpecification(final Specification<E> left, final Specification<E> right) {
		super("&&", left, right);
	}

	@Override
	public final boolean isSatisfiedBy(final E e) {
		return getLeft().isSatisfiedBy(e) && getRight().isSatisfiedBy(e);
	}
}