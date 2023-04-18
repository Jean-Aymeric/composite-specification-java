package com.jad.compositespecification;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class XOrSpecificationTest {
    @Test
    public void testGetDescription() {
        final XOrSpecification<String> specification = new XOrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertEquals("^(<contains \"candi\">, <contains \"didate\">)", specification.getDescription());
    }

    @Test
    public void testIsSatisfiedBy() {
        final XOrSpecification<String> specification = new XOrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candi date"));
        assertFalse(specification.isSatisfiedBy("not candidate"));
    }
}