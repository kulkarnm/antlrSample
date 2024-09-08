package com.affaince.benefits.scheme.compilation.units;

import com.affaince.benefits.scheme.BenefitSchemeContext;
import com.affaince.benefits.scheme.expressions.*;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class EligibilityUnit {
    private Expression expression;
    //private List<EligibilityExpressionOutput> eligibilityExpressionWiseOutputs;

    public EligibilityUnit() {
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


    public Expression applyValuesToVariables(Expression expression, BenefitSchemeContext benefitSchemeContext) {
        if (null != expression) {
            if (expression instanceof VariableExpression) {
                String variableName = (String) (expression.getLeftHandSide()).apply();
                Object variableValue = benefitSchemeContext.searchVariableValue(variableName);
                if (null != variableValue) {
                    if (variableValue instanceof List) {
                        expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.COLLECTION));
                    } else if (variableValue instanceof Double) {
                        expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.NUMBER));
                    } else if (variableValue instanceof String) {
                        expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.STRING));
                    } else {
                        expression.setRightHandSide(new UnaryExpression(variableValue, UnaryType.NUMBER));
                    }
                }
            } else if (expression instanceof ArithmeticExpression || expression instanceof ArithmeticComparisonExpression || expression instanceof StringComparisonExpression) {
                if (null != expression.getLeftHandSide()) {
                    expression.setLeftHandSide(applyValuesToVariables(expression.getLeftHandSide(), benefitSchemeContext));
                }
                if (null != expression.getRightHandSide()) {
                    expression.setRightHandSide(applyValuesToVariables(expression.getRightHandSide(), benefitSchemeContext));
                }
            }
        }
        return expression;

    }


    private Boolean processSingleEligibilityExpression(Expression comparisonExpression, BenefitSchemeContext benefitSchemeContext) {
        Expression lhsOfComparison = comparisonExpression.getLeftHandSide();
        Expression rhsOfComparison = comparisonExpression.getRightHandSide();
        applyValuesToVariables(lhsOfComparison, benefitSchemeContext);
        applyValuesToVariables(rhsOfComparison, benefitSchemeContext);
        //lhs is always going to be a string
        return (Boolean) comparisonExpression.apply();
    }
/*
    private List<EligibilityExpressionOutput> processEligibilityExpression() {
        Expression lhs = this.expression.getLeftHandSide();
        ArithmeticOperator operator = this.expression.getOperator();
        List<EligibilityExpressionOutput> outputs = new ArrayList<>();
        EligibilityExpressionOutput output = null;
        if (operator == ArithmeticOperator.AND || operator == ArithmeticOperator.OR) { // it means there are more than one expression, ignore RHS
            List<ArithmeticComparisonExpression> value = (List<ArithmeticComparisonExpression>) ((UnaryExpression) lhs).getValue();
            for (ArithmeticComparisonExpression comparisonExpression : value) {
                output = processSingleEligibilityExpression(comparisonExpression);
                outputs.add(output);
            }
        } else {
            output = processSingleEligibilityExpression(this.expression);
            outputs.add(output);
        }

        return outputs;
    }
*/

    public Boolean processComparisonExpression(Expression compExpression, BenefitSchemeContext benefitSchemeContext) {
        ArithmeticOperator operator=compExpression.getOperator();
        Expression lhs = compExpression.getLeftHandSide();
        if (operator == ArithmeticOperator.OR) {
            if (lhs instanceof UnaryExpression) {
                List<Expression> expressionsList = (List<Expression>) lhs.apply();
                List<Boolean> allOutputs = new ArrayList<>();
                for (Expression comparisonExpression : expressionsList) {
                    allOutputs.add(processComparisonExpression(comparisonExpression, benefitSchemeContext));
                }
                //benefitSchemeContext.setEligibleForScheme(allOutputs.stream().reduce(Boolean::logicalOr).orElse(false));
                return allOutputs.stream().reduce(Boolean::logicalOr).orElse(false);
            }
        } else if (operator == ArithmeticOperator.AND) {
            if (lhs instanceof UnaryExpression) {
                List<Expression> expressionsList = (List<Expression>) lhs.apply();
                List<Boolean> allOutputs = new ArrayList<>();
                for (Expression comparisonExpression : expressionsList) {
                    allOutputs.add(processComparisonExpression(comparisonExpression, benefitSchemeContext));
                }
                //benefitSchemeContext.setEligibleForScheme(allOutputs.stream().reduce(Boolean::logicalAnd).orElse(false));
                return allOutputs.stream().reduce(Boolean::logicalAnd).orElse(false);
            }
        } else {
            return processSingleEligibilityExpression(compExpression, benefitSchemeContext);
        }

        return false;
    }

    public void execute(BenefitSchemeContext benefitSchemeContext) {
        if ((null != expression) && expression instanceof ArithmeticComparisonExpression) {
            benefitSchemeContext.setEligibleForScheme(processComparisonExpression(expression, benefitSchemeContext));
        } else if ((null != expression) && expression instanceof StringComparisonExpression) {
/*
            expression = applyValuesToVariables(expression, benefitSchemeContext);
            boolean expressionOutput = (Boolean) expression.apply();
            benefitSchemeContext.setEligibleForScheme(expressionOutput);
*/
            benefitSchemeContext.setEligibleForScheme(processComparisonExpression(expression, benefitSchemeContext));
        }
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

/*
    public List<EligibilityExpressionOutput> getEligibilityExpressionWiseOutputs() {
        return eligibilityExpressionWiseOutputs;
    }
*/
}
