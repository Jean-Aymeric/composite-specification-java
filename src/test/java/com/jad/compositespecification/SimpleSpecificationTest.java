package com.jad.compositespecification;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SimpleSpecificationTest {
    @Test
    public void testGetDescription() {
        final SimpleSpecification<String> specification = new SimpleSpecification<String>("equals \"candidate\"") {
            @Override
            public boolean isSatisfiedBy(String candidate) {
                return candidate.equals("candidate");
            }
        };
        assertEquals("<equals \"candidate\">", specification.getDescription());
    }

    @Test
    public void testIsSatisfiedBy() {
        final SimpleSpecification<String> specification = new SimpleSpecification<String>("equals \"candidate\"") {
            @Override
            public boolean isSatisfiedBy(String candidate) {
                return candidate.equals("candidate");
            }
        };
        assertTrue(specification.isSatisfiedBy("candidate"));
        assertFalse(specification.isSatisfiedBy("not candidate"));
    }

}