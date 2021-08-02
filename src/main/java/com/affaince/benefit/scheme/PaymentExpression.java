package com.affaince.benefit.scheme;

import java.util.*;

public class PaymentExpression {
    private Expression payableVariable;
    private PaymentPrecedence precedence;
    private List<Expression> vestingPeriodicityExpressions;
    private Expression multiplierVariable;
    private Map<Expression,Expression> vestingDistributionExpressions;

    public PaymentExpression(){
        vestingPeriodicityExpressions = new ArrayList<>();
        vestingDistributionExpressions = new HashMap<>();
    }

    public void syncAllVariableReferences(GivenUnit givenUnit,ComputeUnit computeUnit) {
        //payableVariable
        Expression valuedVariableExpression = searchVariableExpressionByName((String)payableVariable.getLeftHandSide().apply(),givenUnit,computeUnit);
        if(null != valuedVariableExpression) {
            payableVariable.setRightHandSide(valuedVariableExpression.getRightHandSide());
        }
        valuedVariableExpression = searchVariableExpressionByName((String)multiplierVariable.getLeftHandSide().apply(),givenUnit,computeUnit);
        if(null != valuedVariableExpression) {
            multiplierVariable.setRightHandSide(valuedVariableExpression.getRightHandSide());
        }
        for(Expression vestingPeriodicityExpression : vestingPeriodicityExpressions){
            valuedVariableExpression = searchVariableExpressionByName((String)vestingPeriodicityExpression.getRightHandSide().getLeftHandSide().apply(),givenUnit,computeUnit);
            if(null != valuedVariableExpression){
                vestingPeriodicityExpression.getRightHandSide().setRightHandSide(valuedVariableExpression.getRightHandSide());
            }
        }
        for(Map.Entry<Expression,Expression> vestingDistributionExpressionEntry : vestingDistributionExpressions.entrySet()){
            Expression vestingPeriodicityExpression = vestingDistributionExpressionEntry.getKey();
            valuedVariableExpression = searchVariableExpressionByName((String)vestingPeriodicityExpression.getRightHandSide().getLeftHandSide().apply(),givenUnit,computeUnit);
            if(null != valuedVariableExpression){
                vestingPeriodicityExpression.getRightHandSide().setRightHandSide(valuedVariableExpression.getRightHandSide());
            }
            Expression arithmeticExpression = vestingDistributionExpressionEntry.getValue();
            Expression payVariableExpression = arithmeticExpression.getRightHandSide();
            valuedVariableExpression = searchVariableExpressionByName((String)payVariableExpression.getLeftHandSide().apply(),givenUnit,computeUnit);
            if(null != valuedVariableExpression){
                payVariableExpression.getLeftHandSide().setRightHandSide(valuedVariableExpression.getRightHandSide());
            }
        }
    }

    public Expression searchVariableExpressionByName(String variableName, GivenUnit givenUnit,ComputeUnit computeUnit) {
        Expression foundVariable = null;
        foundVariable = givenUnit.searchVariableExpression(variableName);
        if( null != foundVariable){
            return  foundVariable ;
        }else{
            foundVariable = computeUnit.searchVariableExpression(variableName);
            if(null != foundVariable){
                return  foundVariable;
            }
        }
        return  null;
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

    public Map<Expression,Expression> getVestingDistributionExpressions() {
        return vestingDistributionExpressions;
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

    public void setVestingDistributionExpressions(Map<Expression,Expression> vestingDistributionExpressions) {
        this.vestingDistributionExpressions = vestingDistributionExpressions;
    }

    public Expression getMultiplierVariable() {
        return multiplierVariable;
    }

    public void setMultiplierVariable(Expression multiplierVariable) {
        this.multiplierVariable = multiplierVariable;
    }
}
