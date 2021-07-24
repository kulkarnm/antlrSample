package com.affaince.benefit.scheme;

import java.util.List;

public class CommonInputContext {
    private List<VariableExpression> inputVariables;

    public CommonInputContext(List<VariableExpression> inputVariables){
        this.inputVariables=inputVariables;
    }

    public List<VariableExpression> getInputVariables() {
        return inputVariables;
    }
}
