package com.jad.compositespecification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The type N ary specification.
 *
 * @param <E> the type parameter
 */
public abstract class NArySpecification<E> extends CompositeSpecification<E> {

	private final ArrayList<Specification<E>> specifications = new ArrayList<>();

	/**
	 * Instantiates a new N ary specification.
	 *
	 * @param specifications the specifications
	 */
	@SafeVarargs
	public NArySpecification(final String description, final Specification<E>... specifications) {
		super(description);
		this.specifications.addAll(Arrays.asList(specifications));
	}

	/**
	 * Add.
	 *
	 * @param specification the specification
	 */
	public final void add(Specification<E> specification) {
		this.specifications.add(specification);
	}

	/**
	 * Gets specifications.
	 *
	 * @return the specifications
	 */
	public final ArrayList<Specification<E>> getSpecifications() {
		return specifications;
	}

	@Override
	public final String toString() {
		return this.getDescription() + "(" + this.specifications.stream().map(Specification::toString).collect(Collectors.joining(", ")) + ")";
	}
}