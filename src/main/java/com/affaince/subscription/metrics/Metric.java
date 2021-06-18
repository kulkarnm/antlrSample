package com.affaince.subscription.metrics;

import com.affaince.vo.AttributeTypes;

public class Metric {
        private String metricName;
        private String mappedAttributeName;
        private AttributeTypes attributeType;
        private Object metricValue;

    public Metric(String metricName, String mappedAttributeName, AttributeTypes attributeType) {
        this.metricName = metricName;
        this.mappedAttributeName = mappedAttributeName;
        this.attributeType = attributeType;
    }

    public void setMetricValue(Object metricValue){
        this.metricValue = metricValue;
    }
}
