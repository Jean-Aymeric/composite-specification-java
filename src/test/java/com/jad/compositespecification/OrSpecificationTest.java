package com.jad.compositespecification;

import static org.junit.Assert.*;

public class OrSpecificationTest {
    @org.junit.Test
    public void testToString() {
        final OrSpecification<String> specification = new OrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertEquals("||(<contains \"candi\">, <contains \"didate\">)", specification.toString());
    }

    @org.junit.Test
    public void testIsSatisfiedBy() {
        final OrSpecification<String> specification = new OrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candi date"));
        assertFalse(specification.isSatisfiedBy("not can di date"));
    }
}