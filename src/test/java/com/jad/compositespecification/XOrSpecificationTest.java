package com.jad.compositespecification;

import static org.junit.Assert.*;

public class XOrSpecificationTest {
    @org.junit.Test
    public void testToString() {
        final XOrSpecification<String> specification = new XOrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertEquals("^(<contains \"candi\">, <contains \"didate\">)", specification.toString());
    }

    @org.junit.Test
    public void testIsSatisfiedBy() {
        final XOrSpecification<String> specification = new XOrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candi date"));
        assertFalse(specification.isSatisfiedBy("not candidate"));
    }
}