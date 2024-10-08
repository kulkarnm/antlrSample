package com.affaince.benefits.scheme.compilation.units;

import com.affaince.benefits.scheme.BenefitSchemeContext;
import com.affaince.benefits.scheme.expressions.Expression;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class GivenUnit {
    private List<Expression> expressionQueue;

    public GivenUnit() {
        this.expressionQueue = new ArrayList<>();
    }

    public void addExpression(Expression expression){
        String variableName = expression.getLeftHandSide().apply().toString();
        boolean isAlreadyExist = expressionQueue.stream().anyMatch(exp->exp.getLeftHandSide().apply().toString().equals(variableName)) ;
        if(! isAlreadyExist) {
            this.expressionQueue.add(expression);
        }else{
            expressionQueue = expressionQueue.stream().
                    map(exp->exp.getLeftHandSide().apply().toString().equals(variableName) ? expression : exp).
                    collect(Collectors.toList());
        }
    }

    public List<Expression> getExpressionQueue() {
        return expressionQueue;
    }

/*
    public void execute(BenefitSchemeContext benefitSchemeContext){
        for(Expression expression: expressionQueue){
            benefitSchemeContext.addToInputVariables((String)expression.getLeftHandSide().apply(),expression.apply());
        }
    }
*/

    public void execute(BenefitSchemeContext benefitSchemeContext){
        List<Expression> queue = this.getExpressionQueue();
        String variableName;
        Object value;
        for (Expression expression : queue) {
            if(null == expression.getRightHandSide()) {
                variableName = (String) expression.getLeftHandSide().apply();
                value = benefitSchemeContext.getBenefitsProcessingContext().findValue(variableName);
            }else{
                variableName = (String) expression.getLeftHandSide().apply();
                value = expression.getRightHandSide().apply();
            }
            if (null != value) {
                benefitSchemeContext.addToInputVariables(variableName, value);
            }
        }
    }

    public Expression searchVariableExpression(String variableName) {
        List<Expression> variableExpressionsQueue = this.getExpressionQueue();
        for(Expression expression: variableExpressionsQueue){
            String inputVariableName= (String)expression.getLeftHandSide().apply();
            if(inputVariableName.equals(variableName)){
                return expression;
            }
        }
        return null;
    }


}
