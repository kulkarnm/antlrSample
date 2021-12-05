package com.affaince.benefit.processors.exec;

import com.affaince.benefit.context.MetricsContext;
import com.affaince.benefit.scheme.*;
import com.affaince.benefit.scheme.compilation.units.GivenUnit;
import com.affaince.benefit.scheme.expressions.Expression;
import com.affaince.benefit.scheme.expressions.UnaryExpression;
import com.affaince.benefit.scheme.expressions.VariableExpression;
import com.affaince.benefit.scheme.expressions.VariableIdentifierExpression;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ExpressionLoaderProcessor {

    public Scheme convertToInputExpressions(Scheme scheme, Object dummyEvent2){
        try {
            List<Field> eventFields = Arrays.asList(dummyEvent2.getClass().getDeclaredFields());
            for (Field eventField : eventFields) {
                eventField.setAccessible(true);
                String str = eventField.getName();
                Class type =eventField.getType();
                str = str.replaceAll("([^A-Z])([A-Z0-9])", "$1_$2") // standard replace
                        .replaceAll("([A-Z]+)([A-Z0-9][^A-Z]+)", "$1_$2") // last letter after full uppercase.
                        .replaceAll("([0-9]+)([a-zA-Z]+)", "$1_$2").toLowerCase(); // letters after numbers
                str = str.toUpperCase();
                Object value = eventField.get(dummyEvent2);
                VariableExpression variableExpression = new VariableExpression(new VariableIdentifierExpression(str),new UnaryExpression(value,UnaryExpression.obtainUnaryType(type)));
                scheme.getGivenUnit().addExpression(variableExpression);
                scheme.getEligibilityUnit().updateExpression(variableExpression);
                scheme.getComputeUnit().updateExpression(variableExpression);
                //scheme.getPayUnit().updateExpression(variableExpression);
            }
        }catch(IllegalAccessException ex){
            ex.printStackTrace();
        }
        return scheme;
    }


    public Scheme supplyVariableValues(Scheme scheme, MetricsContext metricsContext){
        List<Expression> queue = scheme.getGivenUnit().getExpressionQueue();
        for(Expression expression: queue){
            String variableName=(String)expression.getLeftHandSide().apply();
            Object value = metricsContext.findValue(variableName);
            if(null != value) {
                VariableExpression variableExpression = new VariableExpression(new VariableIdentifierExpression(variableName), new UnaryExpression(value, UnaryExpression.obtainUnaryType(Object.class)));
                scheme.getGivenUnit().addExpression(variableExpression);
                scheme.getEligibilityUnit().updateExpression(variableExpression);
                scheme.getComputeUnit().updateExpression(variableExpression);
            }
        }
        return scheme;
    }

}
