package com.jad.compositespecification;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class OrSpecificationTest {
    @Test
    public void testGetDescription() {
        final OrSpecification<String> specification = new OrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertEquals("||(<contains \"candi\">, <contains \"didate\">)", specification.getDescription());
    }

    @Test
    public void testIsSatisfiedBy() {
        final OrSpecification<String> specification = new OrSpecification<>(new RuleContains("candi"),
                new RuleContains("didate"));
        assertTrue(specification.isSatisfiedBy("candi date"));
        assertFalse(specification.isSatisfiedBy("not can di date"));
    }
}