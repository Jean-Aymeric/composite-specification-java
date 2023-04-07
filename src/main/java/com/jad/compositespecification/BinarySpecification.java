package com.jad.compositespecification;

/**
 * The type Binary specification.
 *
 * @param <E> the type parameter
 */
public abstract class BinarySpecification<E> extends NArySpecification<E> {

	/**
	 * Instantiates a new Binary specification.
	 *
	 * @param left  the left specification
	 * @param right the right specification
	 */
	public BinarySpecification(final String description, final Specification<E> left, final Specification<E> right) {
		super(description, left, right);
	}

	/**
	 * Gets left specification.
	 *
	 * @return the left specification
	 */
	public final Specification<E> getLeft() {
		return getSpecifications().get(0);
	}

	/**
	 * Gets right specification.
	 *
	 * @return the right specification
	 */
	public final Specification<E> getRight() {
		return getSpecifications().get(1);
	}
}