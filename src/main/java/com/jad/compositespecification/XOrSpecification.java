package com.jad.compositespecification;

/**
 * The type X or specification.
 *
 * @param <E> the type parameter
 */
class XOrSpecification<E> extends BinarySpecification<E> {

	/**
	 * Instantiates a new X or specification.
	 *
	 * @param left  the left
	 * @param right the right
	 */
	public XOrSpecification(final Specification<E> left, final Specification<E> right) {
		super("^", left, right);
	}

	@Override
	public final boolean isSatisfiedBy(final E e) {
		return getLeft().isSatisfiedBy(e) ^ getRight().isSatisfiedBy(e);
	}
}