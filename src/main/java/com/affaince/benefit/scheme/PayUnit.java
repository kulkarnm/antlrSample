package com.affaince.benefit.scheme;

import java.util.LinkedList;

public class PayUnit {
    private PaymentExpression paymentExpression;

    public PayUnit() {
    }

    public void setPaymentExpression(PaymentExpression paymentExpression) {
        this.paymentExpression = paymentExpression;
    }

    public PaymentExpression getPaymentExpression() {
        return paymentExpression;
    }
}
