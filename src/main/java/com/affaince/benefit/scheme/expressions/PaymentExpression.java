package com.affaince.benefit.scheme.expressions;

import com.affaince.benefit.scheme.compilation.units.ComputeUnit;
import com.affaince.benefit.scheme.compilation.units.GivenUnit;
import com.affaince.benefit.scheme.vo.VestingDistribution;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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

    public void syncAllVariableReferences(GivenUnit givenUnit, ComputeUnit computeUnit) {
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
        for(VestingDistribution vestingDistributionExpressionEntry : vestingDistributions){
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
