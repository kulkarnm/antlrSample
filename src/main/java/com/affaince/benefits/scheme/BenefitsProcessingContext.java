package com.affaince.benefits.scheme;

import java.util.HashMap;
import java.util.Map;

public class BenefitsProcessingContext {

    private Map<String,Object> intermediateVariables;

    public BenefitsProcessingContext() {
        intermediateVariables = new HashMap<>();
    }

    public Object findValue(String metricName){
        Object value=null;
        value = intermediateVariables.entrySet().stream().filter(mtrc-> mtrc.getKey().equalsIgnoreCase(metricName)).findFirst().map(Map.Entry::getValue).orElse(null);
        return value;
    }

    public void addToIntermediateVariables(String key, Object value){
        intermediateVariables.put(key,value);
    }

    public Map<String, Object> getIntermediateVariables() {
        return intermediateVariables;
    }

}
