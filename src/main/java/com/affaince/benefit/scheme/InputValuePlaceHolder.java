package com.affaince.benefit.scheme;

public class InputValuePlaceHolder {
    private String variableName;
    private Object variableValue= "$$DUMMY";

    public InputValuePlaceHolder(String variableName){
        this.variableName=variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    public Object getVariableValue() {
        return variableValue;
    }
}
