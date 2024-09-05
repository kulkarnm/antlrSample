package com.affaince.benefits.scheme.vo;

import com.affaince.benefits.scheme.expressions.Expression;

public class VestingDistribution {
    Expression key;
    Expression value;

    public VestingDistribution(){}
    public VestingDistribution(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    public Expression getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }
}
