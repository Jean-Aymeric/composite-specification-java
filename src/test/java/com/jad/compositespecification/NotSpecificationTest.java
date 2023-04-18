package com.jad.compositespecification;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class NotSpecificationTest {
    @Test
    public void testGetDescription() {
        final NotSpecification<String> specification = new NotSpecification<>(new RuleContains("candi"));
        assertEquals("!(<contains \"candi\">)", specification.getDescription());
    }

    @Test
    public void testIsSatisfiedBy() {
        final NotSpecification<String> specification = new NotSpecification<>(new RuleContains("candi"));
        assertTrue(specification.isSatisfiedBy("can didate"));
        assertFalse(specification.isSatisfiedBy("not candidate"));
    }
}