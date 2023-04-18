package com.jad.compositespecification;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CompositeSpecificationPackageTest {
    @Test
    public void testIsSatisfiedBy() {
        Specification<String> specification = new RuleContains("candi").and(new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candidate"));
        assertFalse(specification.isSatisfiedBy("not candi date"));
        specification = specification.or(new RuleContains("date"));
        assertTrue(specification.isSatisfiedBy("candidate"));
        assertTrue(specification.isSatisfiedBy("candi date"));
        assertFalse(specification.isSatisfiedBy("not candi d ate"));
        specification = specification.xor(new RuleContains("candi"));
        assertTrue(specification.isSatisfiedBy("cand idate"));
        assertFalse(specification.isSatisfiedBy("candidate"));
        specification = specification.not();
        assertFalse(specification.isSatisfiedBy("cand idate"));
        assertTrue(specification.isSatisfiedBy("candidate"));
    }
}
