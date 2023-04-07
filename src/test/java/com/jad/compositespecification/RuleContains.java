package com.jad.compositespecification;

public class RuleContains extends SimpleSpecification<String> {
    private final String key;

    public RuleContains(final String key) {
        super("contains \"" + key + "\"");
        this.key = key;
    }

    @Override
    public boolean isSatisfiedBy(String candidate) {
        return candidate.contains(key);
    }
}
