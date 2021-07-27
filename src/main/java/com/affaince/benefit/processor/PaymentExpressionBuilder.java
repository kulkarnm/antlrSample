package com.affaince.benefit.processor;

import com.affaince.benefit.BenefitParser;
import com.affaince.benefit.scheme.Expression;
import com.affaince.benefit.scheme.PaymentExpression;
import com.affaince.benefit.scheme.PaymentPrecedence;

import java.util.List;

public class PaymentExpressionBuilder {

    public PaymentExpression buildPaymentExpression(BenefitParser.PayUnitContext payUnitContext){
        PaymentExpression paymentExpression = new PaymentExpression();
        paymentExpression.setPayableVariable(buildPayableVariableExpression(payUnitContext));
        paymentExpression.setPrecedence(buildPaymentPrecedence(payUnitContext));
        paymentExpression.setVestingExpressions(buildVestingExpressions(payUnitContext));
        paymentExpression.setProportionExpressions(buildProportionExpressions(payUnitContext));
        return paymentExpression;
    }

    private Expression buildPayableVariableExpression(BenefitParser.PayUnitContext payUnitContext){
        return null;
    }

    private PaymentPrecedence buildPaymentPrecedence(BenefitParser.PayUnitContext payUnitContext){
        return null;
    }

    private List<Expression> buildVestingExpressions(BenefitParser.PayUnitContext payUnitContext){
        return null;
    }

    private List<Expression> buildProportionExpressions(BenefitParser.PayUnitContext payUnitContext){
        return null;
    }
}
