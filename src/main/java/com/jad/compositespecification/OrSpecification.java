package com.jad.compositespecification;

/**
 * The type Or specification.
 *
 * @param <E> the type parameter
 */
class OrSpecification<E> extends BinarySpecification<E> {

	/**
	 * Instantiates a new Or specification.
	 *
	 * @param left  the left specification
	 * @param right the right specification
	 */
	public OrSpecification(final Specification<E> left, final Specification<E> right) {
		super("||", left, right);
	}

	@Override
	public final boolean isSatisfiedBy(final E e) {
		return getLeft().isSatisfiedBy(e) || getRight().isSatisfiedBy(e);
	}
}