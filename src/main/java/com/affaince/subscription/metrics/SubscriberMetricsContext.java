package com.affaince.subscription.metrics;

import java.util.ArrayList;
import java.util.List;

public class SubscriberMetricsContext {
    private String subscriberId;
    private double benefitCount;
    private double benefitValue;
    private List<Metric> metrics;

    public SubscriberMetricsContext(String subscriberId){
        this.subscriberId = subscriberId;
        this.metrics = new ArrayList<>();
    }

    public void addMetric(Metric metric){
        this.metrics.add(metric);
    }

    public String getSubscriberId() {
        return subscriberId;
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
