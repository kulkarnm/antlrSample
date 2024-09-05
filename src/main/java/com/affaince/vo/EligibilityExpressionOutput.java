package com.affaince.vo;

import com.affaince.benefits.scheme.expressions.ArithmeticOperator;
import com.affaince.benefits.scheme.expressions.UnaryType;

public class EligibilityExpressionOutput {
    private String metricName;
    private Object value;
    private UnaryType valueType;
    private ArithmeticOperator operator;

    public EligibilityExpressionOutput(String metricName, Object value, UnaryType valueType, ArithmeticOperator operator) {
        this.metricName = metricName;
        this.value = value;
        this.valueType = valueType;
        this.operator = operator;
    }

    public String getMetricName() {
        return metricName;
    }

    public Object getValue() {
        return value;
    }

    public UnaryType getValueType() {
        return valueType;
    }

    public ArithmeticOperator getOperator() {
        return operator;
    }
}
