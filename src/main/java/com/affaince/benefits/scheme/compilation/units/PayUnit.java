package com.affaince.benefits.scheme.compilation.units;

import com.affaince.benefits.scheme.BenefitSchemeContext;
import com.affaince.benefits.scheme.expressions.*;
import com.affaince.benefits.scheme.vo.BenefitInstalmentsDistribution;
import com.affaince.vo.ComputedVariableUnit;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class PayUnit {
    private PaymentExpression paymentExpression;
    public PayUnit() {
    }

    public void setPaymentExpression(PaymentExpression paymentExpression) {
        this.paymentExpression = paymentExpression;
    }

    public Expression applyValuesToVariables(Expression expression, BenefitSchemeContext benefitSchemeContext){
        if( null != expression) {
            if (expression instanceof VariableExpression) {
                String variableName = (String) (expression.getLeftHandSide()).apply();
                Object variableValue = benefitSchemeContext.searchVariableValue(variableName);
                if (null != variableValue) {
                    expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.NUMBER));
                }
            } else if( expression instanceof ArithmeticExpression) {
                if( null != expression.getLeftHandSide() ) {
                    expression.setLeftHandSide(applyValuesToVariables(expression.getLeftHandSide(), benefitSchemeContext));
                }
                if(null != expression.getRightHandSide()) {
                    expression.setRightHandSide(applyValuesToVariables(expression.getRightHandSide(), benefitSchemeContext));
                }
            }
        }
        return expression;

    }
    private ComputedVariableUnit computeDistributionValues(Expression expression,BenefitSchemeContext benefitSchemeContext){
        expression = applyValuesToVariables(expression,benefitSchemeContext);
        Object variableKey =expression.apply();
        Object variableValue = expression.apply();
        return new ComputedVariableUnit(variableKey,variableValue);
    }

    private ComputedVariableUnit computeIntermediateValues(Expression expression,BenefitSchemeContext benefitSchemeContext){
        expression = applyValuesToVariables(expression,benefitSchemeContext);
        Object variableKey =expression.getLeftHandSide().apply();
        Object variableValue = expression.apply();
        return new ComputedVariableUnit(variableKey,variableValue);
    }
    public void execute(BenefitSchemeContext benefitSchemeContext){
        List<Expression> expressionQueue = paymentExpression.getExpressionQueue();
        String startNode = paymentExpression.getExpressionStartNode();
        if(null != startNode && startNode.equals("pay") ) {
            for (Expression expression : expressionQueue) {
                ComputedVariableUnit computedVariable = computeIntermediateValues(expression, benefitSchemeContext);
                benefitSchemeContext.addToComputedVariables((String) computedVariable.getVariableName(), (double) computedVariable.getVariableValue());
            }
            PaymentPrecedence paymentPrecedence = paymentExpression.getPrecedence();
            if (paymentPrecedence == PaymentPrecedence.BEFORE) {
                benefitSchemeContext.setBefore(true);
            }
            List<BenefitInstalmentsDistribution> benefitInstalmentsDistributions = paymentExpression.getBenefitsDistributions();
            if (null != benefitInstalmentsDistributions && !benefitInstalmentsDistributions.isEmpty()) {
                for (BenefitInstalmentsDistribution deliveryWiseBenefitTuple : benefitInstalmentsDistributions) {
                    ComputedVariableUnit key = computeDistributionValues(deliveryWiseBenefitTuple.getKey(), benefitSchemeContext);
                    ComputedVariableUnit value = computeDistributionValues(deliveryWiseBenefitTuple.getValue(), benefitSchemeContext);
                    benefitSchemeContext.addToBenefitVestingDistributionList(((Double) key.getVariableValue()).intValue(), (Double) value.getVariableValue());
                }
            } else {
                List<Expression> instalmentDeliverySequenceExpressions = paymentExpression.getInstalmentDeliverySequencesExpressions();
                for (Expression expression : instalmentDeliverySequenceExpressions) {
                    expression = applyValuesToVariables(expression, benefitSchemeContext);
                    String variableName = (String) expression.getLeftHandSide().getLeftHandSide().apply();
                    double variableValue = (double) expression.apply();
                    //paymentSchemeContext.addToOutputValues(variableName, variableValue);
                    //paymentSchemeContext.setAdvancePaymentValue(variableValue);
                }
            }
        }
    }

}
