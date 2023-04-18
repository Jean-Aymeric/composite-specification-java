package com.jad.compositespecification;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AndSpecificationTest {
    @Test
    public void testGetDescription() {
        final AndSpecification<String> specification = new AndSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertEquals("&&(<contains \"candi\">, <contains \"didate\">)", specification.getDescription());
    }

    @Test
    public void testIsSatisfiedBy() {
        final AndSpecification<String> specification = new AndSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candidate"));
        assertFalse(specification.isSatisfiedBy("not candi date"));
    }
}