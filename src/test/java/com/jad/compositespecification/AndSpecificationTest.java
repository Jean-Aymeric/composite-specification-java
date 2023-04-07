package com.jad.compositespecification;

import static org.junit.Assert.*;

public class AndSpecificationTest {
    @org.junit.Test
    public void testToString() {
        final AndSpecification<String> specification = new AndSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertEquals("&&(<contains \"candi\">, <contains \"didate\">)", specification.toString());
    }

    @org.junit.Test
    public void testIsSatisfiedBy() {
        final AndSpecification<String> specification = new AndSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candidate"));
        assertFalse(specification.isSatisfiedBy("not candi date"));
    }
}