package com.affaince.benefit.dummy;

import com.affaince.benefit.scheme.Scheme;
import com.affaince.benefit.scheme.UnaryExpression;
import com.affaince.benefit.scheme.VariableExpression;
import com.affaince.benefit.scheme.VariableIdentifierExpression;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class DummyEventProcessor {

    public Scheme processDummyEvent(Scheme scheme, Object dummyEvent2){
        try {

            List<Field> eventFields = Arrays.asList(dummyEvent2.getClass().getDeclaredFields());
            for (Field eventField : eventFields) {
                eventField.setAccessible(true);
                String str = eventField.getName();
                str = str.replaceAll("([^A-Z])([A-Z0-9])", "$1_$2") // standard replace
                        .replaceAll("([A-Z]+)([A-Z0-9][^A-Z]+)", "$1_$2") // last letter after full uppercase.
                        .replaceAll("([0-9]+)([a-zA-Z]+)", "$1_$2").toLowerCase(); // letters after numbers
                str = str.toUpperCase();
                Object value = eventField.get(dummyEvent2);
                VariableExpression variableExpression = new VariableExpression(new VariableIdentifierExpression(str),new UnaryExpression(value));
                scheme.getGivenUnit().addExpression(variableExpression);
            }
        }catch(IllegalAccessException ex){
            ex.printStackTrace();
        }
        return scheme;
    }
}
