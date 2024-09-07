package com.affaince.benefits.scheme.compilation.units;

import com.affaince.benefits.scheme.BenefitSchemeContext;
import com.affaince.benefits.scheme.expressions.*;
import com.affaince.vo.EligibilityExpressionOutput;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import sun.tools.jstat.Operator;

import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class EligibilityUnit {
    private Expression expression;
    //private List<EligibilityExpressionOutput> eligibilityExpressionWiseOutputs;

    public EligibilityUnit() {
    }

    public void setExpression(Expression expression){
        this.expression=expression;
    }

/*
    private Expression updateVariablesUsedInUnit(Expression sourceExpression, Expression updatedExpression){
        if(null != sourceExpression && sourceExpression instanceof VariableExpression){
            boolean isFound = sourceExpression.getLeftHandSide().apply().toString().equals(updatedExpression.getLeftHandSide().apply().toString());
            if(isFound){
                return updatedExpression;
            }
        }else if(null != sourceExpression && sourceExpression instanceof List<?>){
            List<?> rhs = (List<?>)sourceExpression;
            for(Object rhsObj : rhs){
                if( rhsObj instanceof Expression){
                   updateVariablesUsedInUnit((Expression)rhsObj,updatedExpression);
                }
            }
        }else if (null != sourceExpression && sourceExpression instanceof UnaryExpression){
            Object value = ((UnaryExpression) sourceExpression).getValue();
            if(value instanceof List<?>){
                for(Expression embeddedExp : (List<Expression>)value){
                    updateVariablesUsedInUnit(embeddedExp,updatedExpression);
                }
            }
        }else {
            if(null != sourceExpression) {
                Expression lhs = sourceExpression.getLeftHandSide();
                Expression result = updateVariablesUsedInUnit(lhs, updatedExpression);
                if(null != result){
                    sourceExpression.setLeftHandSide(result);
                }
                Expression rhs = sourceExpression.getRightHandSide();
                result = updateVariablesUsedInUnit(rhs, updatedExpression);
                if(null != result){
                    sourceExpression.setRightHandSide(result);
                }
                Expression pre = sourceExpression.getPreExpression();
                result = updateVariablesUsedInUnit(pre,updatedExpression);
                if(null != result){
                    sourceExpression.setPreExpression(result);
                }
            }
        }
        return null;
    }
    public void updateExpression(Expression updatedExpression){
        updateVariablesUsedInUnit(expression,updatedExpression);
    }
*/
    private List<EligibilityExpressionOutput> processEligibilityExpression() {
        Expression lhs = this.expression.getLeftHandSide();
        ArithmeticOperator operator = this.expression.getOperator();
        List<EligibilityExpressionOutput> outputs = new ArrayList<>();
        EligibilityExpressionOutput output=null;
        if (operator == ArithmeticOperator.AND || operator == ArithmeticOperator.OR) { // it means there are more than one expression, ignore RHS
            List<ArithmeticComparisonExpression> value = (List<ArithmeticComparisonExpression>) ((UnaryExpression) lhs).getValue();
            for (ArithmeticComparisonExpression comparisonExpression : value) {
                output = processSingleEligibilityExpression(comparisonExpression);
                outputs.add(output);
            }
        } else{
            output = processSingleEligibilityExpression(this.expression);
            outputs.add(output);
        }

        return outputs;
    }

    private EligibilityExpressionOutput processSingleEligibilityExpression(Expression comparisonExpression) {
        Expression lhsOfComparison = comparisonExpression.getLeftHandSide();
        Expression rhsOfComparison = comparisonExpression.getRightHandSide();
        ArithmeticOperator operatorOfComparison = comparisonExpression.getOperator();
        //lhs is always going to be a string
        String metricName = lhsOfComparison.getLeftHandSide().apply().toString();
        Object rhsValue = rhsOfComparison.apply();
        UnaryType valueType = ((UnaryExpression) rhsOfComparison).getType();
        EligibilityExpressionOutput output = new EligibilityExpressionOutput(metricName, rhsValue, valueType, operatorOfComparison);
        return output;
    }

    public Expression applyValuesToVariables(Expression expression,BenefitSchemeContext benefitSchemeContext){
        if( null != expression) {
            if (expression instanceof VariableExpression) {
                String variableName = (String) (expression.getLeftHandSide()).apply();
                Object variableValue = benefitSchemeContext.searchVariableValue(variableName);
                if (null != variableValue) {
                    if( variableValue instanceof List){
                        expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.COLLECTION));
                    }else {
                        expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.NUMBER));
                    }
                }
            } else if( expression instanceof ArithmeticExpression || expression instanceof ArithmeticComparisonExpression) {
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


    public void execute(BenefitSchemeContext benefitSchemeContext){
        if((null != expression) && expression instanceof ArithmeticComparisonExpression){
            ArithmeticOperator operator = ((ArithmeticComparisonExpression)expression).getOperator();
            if(operator == ArithmeticOperator.OR){
                Expression lhs = expression.getLeftHandSide();
                Expression rhs = expression.getRightHandSide();
                if( null != lhs && null !=rhs) {
                    boolean lhsOutput = false;
                    boolean rhsOutput = false;
                    if (lhs instanceof ArithmeticComparisonExpression) {
                        lhs = applyValuesToVariables(lhs,benefitSchemeContext);
                        lhsOutput = (Boolean) lhs.apply();
                    }
                    if (rhs instanceof ArithmeticComparisonExpression) {
                        rhs = applyValuesToVariables(rhs,benefitSchemeContext);
                        rhsOutput = (Boolean) rhs.apply();
                    }
                    benefitSchemeContext.setEligibleForScheme(lhsOutput || rhsOutput);
                }else if( null != lhs && lhs instanceof UnaryExpression){
                    List<Expression> expressionsList = (List<Expression>)lhs.apply();
                    List<Boolean> allOutputs = new ArrayList<>();
                    for(Expression expression : expressionsList){
                        expression = applyValuesToVariables(expression,benefitSchemeContext);
                        allOutputs.add((Boolean) expression.apply());
                    }
                    benefitSchemeContext.setEligibleForScheme(allOutputs.stream().reduce(Boolean::logicalOr).orElse(false));
                }
            }else if( operator == ArithmeticOperator.AND){
                Expression lhs = expression.getLeftHandSide();
                Expression rhs = expression.getRightHandSide();
                if(null !=lhs && null !=rhs ){
                    boolean lhsOutput = false;
                    boolean rhsOutput = false;
                    if (lhs instanceof ArithmeticComparisonExpression) {
                        lhs = applyValuesToVariables(lhs,benefitSchemeContext);
                        lhsOutput = (Boolean) lhs.apply();
                    }
                    if (rhs instanceof ArithmeticComparisonExpression) {
                        rhs = applyValuesToVariables(rhs,benefitSchemeContext);
                        rhsOutput = (Boolean) rhs.apply();
                    }

                    benefitSchemeContext.setEligibleForScheme(lhsOutput && rhsOutput);
                }else if( null != lhs && lhs instanceof UnaryExpression){
                    List<Expression> expressionsList = (List<Expression>)lhs.apply();
                    List<Boolean> allOutputs = new ArrayList<>();
                    for(Expression expression : expressionsList){
                        expression = applyValuesToVariables(expression,benefitSchemeContext);
                        allOutputs.add((Boolean) expression.apply());
                    }
                    benefitSchemeContext.setEligibleForScheme(allOutputs.stream().reduce(Boolean::logicalAnd).orElse(false));
                }
            }else{
                if (expression instanceof ArithmeticComparisonExpression) {
                    expression = applyValuesToVariables(expression,benefitSchemeContext);
                    boolean expressionOutput = (Boolean) expression.apply();
                    benefitSchemeContext.setEligibleForScheme(expressionOutput);
                }
            }

        }
    }

    public Expression getExpression() {
        return expression;
    }

/*
    public List<EligibilityExpressionOutput> getEligibilityExpressionWiseOutputs() {
        return eligibilityExpressionWiseOutputs;
    }
*/
}
