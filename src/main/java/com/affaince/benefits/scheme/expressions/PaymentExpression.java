package com.affaince.benefits.scheme.expressions;

import com.affaince.benefits.scheme.vo.BenefitInstalmentsDistribution;

import java.util.*;
public class PaymentExpression {
    private String expressionStartNode;
    private List<Expression> expressionQueue;
    private PaymentPrecedence precedence;
    private List<Expression> instalmentDeliverySequencesExpressions;
    private List<BenefitInstalmentsDistribution> benefitsDistributions;

    public PaymentExpression(){
        expressionQueue = new ArrayList<>();
        instalmentDeliverySequencesExpressions = new ArrayList<>();
        benefitsDistributions = new ArrayList<>();
    }

    public void addExpression(Expression expression) {
        this.expressionQueue.add(expression);
    }

    public Expression searchOutputVariableInExpressionQueue(String variableName){
        for(Expression expression : expressionQueue){
            Expression variableExpression = expression.searchVariableOnLHS(variableName);
            if(null !=variableExpression){
                return variableExpression;
            }
        }
        return null;
    }

    public List<Expression> getExpressionQueue() {
        return expressionQueue;
    }

    public PaymentPrecedence getPrecedence() {
        return precedence;
    }

    public List<Expression> getInstalmentDeliverySequencesExpressions() {
        return instalmentDeliverySequencesExpressions;
    }


    public void setPrecedence(PaymentPrecedence precedence) {
        this.precedence = precedence;
    }


    public void setInstalmentDeliverySequencesExpressions(List<Expression> instalmentDeliverySequencesExpressions) {
        this.instalmentDeliverySequencesExpressions = instalmentDeliverySequencesExpressions;
    }

    public List<BenefitInstalmentsDistribution> getBenefitsDistributions() {
        return benefitsDistributions;
    }

    public void setBenefitsDistributions(List<BenefitInstalmentsDistribution> benefitsDistributions) {
        this.benefitsDistributions = benefitsDistributions;
    }

    public String getExpressionStartNode() {
        return expressionStartNode;
    }

    public void setExpressionStartNode(String expressionStartNode) {
        this.expressionStartNode = expressionStartNode;
    }
}
