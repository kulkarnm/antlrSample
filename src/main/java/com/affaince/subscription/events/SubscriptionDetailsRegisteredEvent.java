package com.affaince.subscription.events;

import com.affaince.vo.Delivery;
import org.joda.time.LocalDate;

import java.util.Map;

public class SubscriptionDetailsRegisteredEvent {
    private String subscriptionId;
    private Map<String, Delivery> deliveries;
    private LocalDate subscriptionCreatedDate;
    private LocalDate subscriptionExpiryDate;

    public SubscriptionDetailsRegisteredEvent(String subscriptionId, Map<String, Delivery> deliveries, LocalDate subscriptionCreatedDate, LocalDate subscriptionExpiryDate) {
        this.subscriptionId = subscriptionId;
        this.deliveries = deliveries;
        this.subscriptionCreatedDate = subscriptionCreatedDate;
        this.subscriptionExpiryDate = subscriptionExpiryDate;
    }
    public SubscriptionDetailsRegisteredEvent(){}

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public Map<String, Delivery> getDeliveries() {
        return deliveries;
    }

    public LocalDate getSubscriptionCreatedDate() {
        return subscriptionCreatedDate;
    }

    public LocalDate getSubscriptionExpiryDate() {
        return subscriptionExpiryDate;
    }

}
