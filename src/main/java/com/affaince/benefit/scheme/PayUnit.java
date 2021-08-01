package com.affaince.benefit.scheme;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PayUnit {
    private PaymentExpression paymentExpression;

    public PayUnit() {
    }
    public Expression searchVariableExpression(String variableName) {
        if(null != paymentExpression){
            return paymentExpression.searchVariableExpression(variableName);
        }
        return null;
    }
    public void setPaymentExpression(PaymentExpression paymentExpression) {
        this.paymentExpression = paymentExpression;
    }

    public PaymentExpression getPaymentExpression() {
        return paymentExpression;
    }

    public void execute(BenefitSchemeContext benefitSchemeContext){

         String payableVariableName = (String)paymentExpression.getPayableVariable().getLeftHandSide().apply();
         Object value = paymentExpression.getPayableVariable().apply();
         benefitSchemeContext.setBenefitValue((Double)value);
         PaymentPrecedence paymentPrecedence = paymentExpression.getPrecedence();
         if(paymentPrecedence==PaymentPrecedence.BEFORE){
             benefitSchemeContext.setBefore(true);
         }
         Map<Expression,Expression> vestingDistributionExpressions = paymentExpression.getVestingDistributionExpressions();
         for(Map.Entry<Expression,Expression> deliveryWiseBenefitTuple: vestingDistributionExpressions.entrySet()){
            benefitSchemeContext.addToBenefitVestingDistributionList((Integer)deliveryWiseBenefitTuple.getKey().apply(),(Double)deliveryWiseBenefitTuple.getValue().apply());
         }
    }
}
