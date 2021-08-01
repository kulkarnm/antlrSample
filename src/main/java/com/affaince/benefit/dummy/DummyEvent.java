package com.affaince.benefit.dummy;

public class DummyEvent {
    private double subscriptionValue;
    private int subscriptionPeriod;
    private int totalDeliveries;

    public DummyEvent(double subscriptionValue, int subscriptionPeriod, int totalDeliveries) {
        this.subscriptionValue = subscriptionValue;
        this.subscriptionPeriod = subscriptionPeriod;
        this.totalDeliveries = totalDeliveries;
    }

    public double getSubscriptionValue() {
        return subscriptionValue;
    }

    public int getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public int getTotalDeliveries() {
        return totalDeliveries;
    }
}
