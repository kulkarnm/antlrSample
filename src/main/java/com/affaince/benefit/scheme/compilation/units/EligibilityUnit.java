package com.affaince.benefit.scheme.compilation.units;

import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.expressions.Expression;
import com.affaince.benefit.scheme.expressions.UnaryExpression;
import com.affaince.benefit.scheme.expressions.VariableExpression;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class EligibilityUnit {
    private Expression expression;

    public EligibilityUnit() {
    }

    public void setExpression(Expression expression){
        this.expression=expression;
    }

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
    public void execute(BenefitSchemeContext benefitSchemeContext){
            if((Boolean)expression.apply()){
                benefitSchemeContext.setEligibleForScheme(true);
            }
    }

    public Expression getExpression() {
        return expression;
    }
}
