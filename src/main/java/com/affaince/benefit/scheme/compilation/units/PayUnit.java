package com.affaince.benefit.scheme.compilation.units;

import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.expressions.Expression;
import com.affaince.benefit.scheme.expressions.PaymentExpression;
import com.affaince.benefit.scheme.expressions.PaymentPrecedence;
import com.affaince.benefit.scheme.vo.VestingDistribution;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;
import java.util.Map;
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
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

         Object value = paymentExpression.getPayableVariable().apply();
         benefitSchemeContext.setBenefitValue((Double)value);
         PaymentPrecedence paymentPrecedence = paymentExpression.getPrecedence();
         if(paymentPrecedence==PaymentPrecedence.BEFORE){
             benefitSchemeContext.setBefore(true);
         }
         List<VestingDistribution> vestingDistributions = paymentExpression.getVestingDistributions();
         for(VestingDistribution deliveryWiseBenefitTuple: vestingDistributions){
            benefitSchemeContext.addToBenefitVestingDistributionList((Double)deliveryWiseBenefitTuple.getKey().apply(),(Double)deliveryWiseBenefitTuple.getValue().apply());
         }
    }

    public void syncAllVariableReferences(GivenUnit givenUnit,ComputeUnit computeUnit){
        this.paymentExpression.syncAllVariableReferences(givenUnit,computeUnit);
    }


}
