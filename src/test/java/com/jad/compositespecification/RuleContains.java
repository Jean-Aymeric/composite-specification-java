package com.jad.compositespecification;

public class RuleContains extends Specification<String> {
    private final String token;

    public RuleContains(final String token) {
        super("contains \"" + token + "\"");
        this.token = token;
    }

    @Override
    public boolean isSatisfiedBy(final String candidate) {
        return candidate.contains(this.token);
    }
}
