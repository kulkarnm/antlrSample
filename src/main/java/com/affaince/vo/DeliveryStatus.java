package com.affaince.vo;

/**
 * Created by rbsavaliya on 02-10-2015.
 */
public enum DeliveryStatus {
    CREATED(0), READYFORDELIVERY(1),APPROVED(2), DELIVERED(3), FAILURE(4), PARTIAL(5), DELETED(6),HALTED(7);

    private final int deliveryStatusCode;

    DeliveryStatus(int deliveryStatusCode) {
        this.deliveryStatusCode = deliveryStatusCode;
    }

    public static DeliveryStatus valueOf(int deliveryStatusCode) {
        for (DeliveryStatus deliveryStatus : DeliveryStatus.values()) {
            if (deliveryStatus.getDeliveryStatusCode() == deliveryStatusCode) {
                return deliveryStatus;
            }
        }
        throw new IllegalArgumentException();
    }
    public int getDeliveryStatusCode() {
        return deliveryStatusCode;
    }
}
