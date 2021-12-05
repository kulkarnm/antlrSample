package com.affaince.vo;

import java.util.HashMap;
import java.util.Map;

public class SchemeInput {
    private Map<String,Object> inputVariables;

    public SchemeInput() {
        this.inputVariables = new HashMap<>();
    }

    public void addToInputs(String name,Object value){
        this.inputVariables.put(name,value);
    }

    public Map<String, Object> getInputVariables() {
        return inputVariables;
    }

    public boolean findVariableByName(String name){
         return inputVariables.containsKey(name);
    }
    public Object findValue(String name){
        if(inputVariables.containsKey(name)){
            return  inputVariables.get(name);
        }
        return null;
    }
}
