package com.jad.compositespecification;

import static org.junit.Assert.*;

public class SimpleSpecificationTest {
    @org.junit.Test
    public void testToString() {
        final SimpleSpecification<String> specification = new SimpleSpecification<String>("equals \"candidate\"") {
            @Override
            public boolean isSatisfiedBy(String candidate) {
                return candidate.equals("candidate");
            }
        };
        assertEquals("<equals \"candidate\">", specification.toString());
    }

    @org.junit.Test
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