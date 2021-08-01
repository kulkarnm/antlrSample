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

/*    public void updateAllVariableReferences(String variableName, Expression expression) {

        Expression foundExpression = searchVariableExpressionByName(variableName, payableVariable);
        if(null != foundExpression){
            foundExpression.setRightHandSide(expression);
        }
        for (Expression variableExpression : this.vestingPeriodicityExpressions) {
            foundExpression = searchVariableExpressionByName(variableName, variableExpression);
            if(null != foundExpression){
                foundExpression.setRightHandSide(expression);
            }
        }
        foundExpression = searchVariableExpressionByName(variableName, multiplierVariable);
        if(null != foundExpression){
            foundExpression.setRightHandSide(expression);
        }
        Set<Map.Entry<Expression, Expression>> entrySet =  vestingDistributionExpressions.entrySet();
        for(Map.Entry<Expression,Expression> entry : entrySet){
            foundExpression = searchVariableExpressionByName(variableName, entry.getKey());
            if(null != foundExpression){
                foundExpression.setRightHandSide(expression);
            }
            foundExpression = searchVariableExpressionByName(variableName, entry.getValue());
            if(null != foundExpression){
                foundExpression.setRightHandSide(expression);
            }
        }
    }

    public Expression searchVariableExpressionByName(String variableName, Expression expression) {
        Expression foundVariable = null;
        if (null != expression) {
            if (expression instanceof VariableExpression) {
                if (((String) expression.getLeftHandSide().apply()).equals(variableName)) {
                    return expression;
                }
            }
            foundVariable = searchVariableExpressionByName(variableName, expression.getLeftHandSide());
            if (null == foundVariable) {
                foundVariable = searchVariableExpressionByName(variableName, expression.getRightHandSide());
            }
        }
        return foundVariable;
    }*/
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
