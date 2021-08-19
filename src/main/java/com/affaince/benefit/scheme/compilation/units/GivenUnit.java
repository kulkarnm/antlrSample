package com.affaince.benefit.scheme.compilation.units;

import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.expressions.Expression;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.LinkedList;
import java.util.List;
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class GivenUnit {
    private LinkedList<Expression> expressionQueue;

    public GivenUnit() {
        this.expressionQueue = new LinkedList<>();
    }

    public void addExpression(Expression expression){
        String variableName = expression.getLeftHandSide().apply().toString();
        boolean isAlreadyExist = expressionQueue.stream().anyMatch(exp->exp.getLeftHandSide().apply().toString().equals(variableName)) ;
        if(! isAlreadyExist) {
            this.expressionQueue.add(expression);
        }
    }

    public LinkedList<Expression> getExpressionQueue() {
        return expressionQueue;
    }

    public void execute(BenefitSchemeContext benefitSchemeContext){
        for(Expression expression: expressionQueue){
            benefitSchemeContext.addToInputVariables((String)expression.getLeftHandSide().apply(),expression.apply());
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
