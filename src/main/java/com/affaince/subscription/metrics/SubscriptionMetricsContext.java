package com.affaince.subscription.metrics;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionMetricsContext {
    private String subscriptionId;
    private double benefitCount;
    private double benefitValue;
    private List<Metric> metrics;

    public SubscriptionMetricsContext(String subscriptionId){
        this.subscriptionId = subscriptionId;
        this.metrics = new ArrayList<>();
    }

    public void addMetric(Metric metric){
        this.metrics.add(metric);
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public double getBenefitCount() {
        return benefitCount;
    }

    public double getBenefitValue() {
        return benefitValue;
    }

    public List<Metric> getMetrics() {
        return metrics;
    }
}
