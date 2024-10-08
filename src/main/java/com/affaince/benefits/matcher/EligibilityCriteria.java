package com.affaince.benefits.matcher;

import com.affaince.benefits.scheme.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class EligibilityCriteria {
    private List<Expression> currentState;

    public EligibilityCriteria() {
        currentState = new ArrayList<>();
    }

    public void addToCurrentState(Expression expression){
        this.currentState.add(expression);
    }

    public List<Expression> getCurrentState() {
        return currentState;
    }
}
