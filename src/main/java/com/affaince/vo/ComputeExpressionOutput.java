package com.affaince.vo;


import com.affaince.benefits.scheme.expressions.UnaryType;

public class ComputeExpressionOutput {
    private String metricName;
    private Object value;
    private UnaryType valueType;

    public ComputeExpressionOutput(String metricName, Object value, UnaryType valueType) {
        this.metricName = metricName;
        this.value = value;
        this.valueType = valueType;
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

}
