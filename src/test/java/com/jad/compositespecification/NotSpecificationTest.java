package com.jad.compositespecification;

import static org.junit.Assert.*;

public class NotSpecificationTest {
    @org.junit.Test
    public void testToString() {
        final NotSpecification<String> specification = new NotSpecification<>(new RuleContains("candi"));
        assertEquals("!(<contains \"candi\">)", specification.toString());
    }

    @org.junit.Test
    public void testIsSatisfiedBy() {
        final NotSpecification<String> specification = new NotSpecification<>(new RuleContains("candi"));
        assertTrue(specification.isSatisfiedBy("can didate"));
        assertFalse(specification.isSatisfiedBy("not candidate"));
    }
}