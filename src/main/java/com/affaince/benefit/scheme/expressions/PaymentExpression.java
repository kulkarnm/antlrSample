package com.affaince.benefit.scheme.expressions;

import com.affaince.benefit.scheme.Scheme;
import com.affaince.benefit.scheme.vo.VestingDistribution;

import java.util.*;
public class PaymentExpression {
    private Expression payableVariable;
    private PaymentPrecedence precedence;
    private List<Expression> vestingPeriodicityExpressions;
    private Expression multiplierVariable;
    private List<VestingDistribution> vestingDistributions;

    public PaymentExpression(){
        vestingPeriodicityExpressions = new ArrayList<>();
        vestingDistributions = new ArrayList<>();
    }

    public void syncAllVariableReferences(Scheme scheme) {
        //payableVariable
        Expression valuedVariableExpression = scheme.searchVariableExpression((String)payableVariable.getLeftHandSide().apply());
        if(null != valuedVariableExpression) {
            payableVariable.setRightHandSide(valuedVariableExpression.getRightHandSide());
        }
        valuedVariableExpression = scheme.searchVariableExpression((String)multiplierVariable.getLeftHandSide().apply());
        if(null != valuedVariableExpression) {
            multiplierVariable.setRightHandSide(valuedVariableExpression.getRightHandSide());
        }
        for(Expression vestingPeriodicityExpression : vestingPeriodicityExpressions){
            valuedVariableExpression = scheme.searchVariableExpression((String)vestingPeriodicityExpression.getRightHandSide().getLeftHandSide().apply());
            if(null != valuedVariableExpression){
                vestingPeriodicityExpression.getRightHandSide().setRightHandSide(valuedVariableExpression.getRightHandSide());
            }
        }
        for(VestingDistribution vestingDistributionExpressionEntry : vestingDistributions){
            Expression vestingPeriodicityExpression = vestingDistributionExpressionEntry.getKey();
            valuedVariableExpression = scheme.searchVariableExpression((String)vestingPeriodicityExpression.getRightHandSide().getLeftHandSide().apply());
            if(null != valuedVariableExpression){
                vestingPeriodicityExpression.getRightHandSide().setRightHandSide(valuedVariableExpression.getRightHandSide());
            }
            Expression arithmeticExpression = vestingDistributionExpressionEntry.getValue();
            Expression payVariableExpression = arithmeticExpression.getRightHandSide();
            valuedVariableExpression = scheme.searchVariableExpression((String)payVariableExpression.getLeftHandSide().apply());
            if(null != valuedVariableExpression){
                payVariableExpression.getLeftHandSide().setRightHandSide(valuedVariableExpression.getRightHandSide());
            }
        }
    }

    public Expression searchVariableExpression(String variableName) {
        String payableVariableName = (String)payableVariable.apply();
        if(variableName.equals(payableVariableName)){
            return payableVariable;
        }else {
            String multiplierVariableName = (String) getMultiplierVariable().apply();
            if(variableName.equals(multiplierVariableName)){
                return multiplierVariable;
            }
        }
        return null;
    }
    public Expression getPayableVariable() {
        return payableVariable;
    }

    public PaymentPrecedence getPrecedence() {
        return precedence;
    }

    public List<Expression> getVestingPeriodicityExpressions() {
        return vestingPeriodicityExpressions;
    }


    public void setPayableVariable(Expression payableVariable) {
        this.payableVariable = payableVariable;
    }

    public void setPrecedence(PaymentPrecedence precedence) {
        this.precedence = precedence;
    }

    public void addToVestingExpression(Expression expression){
        this.vestingPeriodicityExpressions.add(expression);
    }

    public void setVestingPeriodicityExpressions(List<Expression> vestingPeriodicityExpressions) {
        this.vestingPeriodicityExpressions = vestingPeriodicityExpressions;
    }

    public List<VestingDistribution> getVestingDistributions() {
        return vestingDistributions;
    }

    public void setVestingDistributions(List<VestingDistribution> vestingDistributions) {
        this.vestingDistributions = vestingDistributions;
    }

    public Expression getMultiplierVariable() {
        return multiplierVariable;
    }

    public void setMultiplierVariable(Expression multiplierVariable) {
        this.multiplierVariable = multiplierVariable;
    }
}
