package com.affaince.vo;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class Delivery {
    private String subscriberId;
    private String subscriptionId;
    private String deliveryId;
    private int sequence;
    private List<DeliveryItem> deliveryItems;
    private LocalDate deliveryDate;
    private LocalDate acknowledgementDate;
    private DeliveryStatus status;
    //private double deliveryCharges;
    private double totalWeight;
    private double totalDeliveryPrice;
    private ReasonCode reasonCode;
    private LocalDate lastModifiedDate;

    public Delivery(String subscriberId, String subscriptionId, String deliveryId, int sequence, List<DeliveryItem> deliveryItems, LocalDate deliveryDate, LocalDate acknowledgementDate, DeliveryStatus status, LocalDate lastModifiedDate) {
        this.subscriberId=subscriberId;
        this.subscriptionId=subscriptionId;
        this.deliveryId = deliveryId;
        this.sequence=sequence;
        this.deliveryItems = deliveryItems;
        this.deliveryDate = deliveryDate;
        this.acknowledgementDate = acknowledgementDate;
        this.status = status;
        this.lastModifiedDate = lastModifiedDate;
    }

    public Delivery() {
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public List<DeliveryItem> getDeliveryItems() {
        if (this.deliveryItems == null) {
            this.deliveryItems = new ArrayList<>();
        }
        return deliveryItems;
    }

    public void setDeliveryItems(List<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getAcknowledgementDate() {
        return acknowledgementDate;
    }

    public void setAcknowledgementDate(LocalDate acknowledgementDate) {
        this.acknowledgementDate = acknowledgementDate;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    /*public double getDeliveryCharges() {
        return deliveryCharges;
    }*/

 /*   public void setDeliveryCharges(double deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }*/

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalDeliveryPrice() {
        return totalDeliveryPrice;
    }

    public void setTotalDeliveryPrice(double totalDeliveryPrice) {
        this.totalDeliveryPrice = totalDeliveryPrice;
    }

    public void setReasonCode(ReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    public ReasonCode getReasonCode() {
        return reasonCode;
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public double calculateTotalWeightInGrams() {
        totalWeight = 0;
        for (DeliveryItem deliveryItem : this.deliveryItems) {
            totalWeight = totalWeight + deliveryItem.getWeightInGrms();
        }
        return totalWeight;
    }

 /*   public void calculateItemLevelDeliveryCharges(DeliveryChargesRule deliveryChargesRule) {
        List<RangeRule> rangeRules = deliveryChargesRule.getDeliveryChargesRules();
        for (RangeRule rangeRule:rangeRules) {
            if (totalWeight/1000 > rangeRule.getRuleMinimum() && totalWeight/1000 < rangeRule.getRuleMaximum()) {
                deliveryCharges = rangeRule.getApplicableValue();
                break;
            }
        }
        for (DeliveryItem item: deliveryItems) {
            totalDeliveryPrice = totalDeliveryPrice + item.getOfferedPricePerUnit();
            item.setDeliveryCharges((item.getOfferedPricePerUnit() * deliveryCharges) / totalDeliveryPrice);
        }
    }*/

    public double calculateRevenue(){
        return deliveryItems.stream().map(di->di.getOfferedPricePerUnit()).reduce(0.0,(x,y)->x+y);
    }

    public double calculateCost(){
        return 0.0;
    }
    public double calculateProfit(){
        double revenue =this.calculateRevenue();
        return 0.0;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "subscriberId='" + subscriberId + '\'' +
                ", subscriptionId='" + subscriptionId + '\'' +
                ", deliveryId='" + deliveryId + '\'' +
                ", sequence=" + sequence +
                ", deliveryItems=" + deliveryItems +
                ", deliveryDate=" + deliveryDate +
                ", acknowledgementDate=" + acknowledgementDate +
                ", status=" + status +
                //", deliveryCharges=" + deliveryCharges +
                ", totalWeight=" + totalWeight +
                ", totalDeliveryPrice=" + totalDeliveryPrice +
                ", reasonCode=" + reasonCode +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
