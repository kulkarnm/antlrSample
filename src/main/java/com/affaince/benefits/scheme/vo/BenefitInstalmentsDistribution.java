package com.affaince.benefits.scheme.vo;


import com.affaince.benefits.scheme.expressions.Expression;

public class BenefitInstalmentsDistribution {
    Expression key;
    Expression value;

    public BenefitInstalmentsDistribution(){}
    public BenefitInstalmentsDistribution(Expression key, Expression value) {
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
