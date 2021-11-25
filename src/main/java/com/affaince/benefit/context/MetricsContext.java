package com.affaince.benefit.context;

import java.util.HashMap;
import java.util.Map;

public class MetricsContext {

    private Map<String,Object> subscriberMetrics;
    private Map<String,Object> subscriptionMetrics;
    private Map<String,Object> productMetrics;
    private Map<String,Object> brandMetrics;

    public MetricsContext() {
        subscriberMetrics = new HashMap<>();
        subscriptionMetrics=new HashMap<>();
        productMetrics = new HashMap<>();
        brandMetrics = new HashMap<>();
    }

    public Object findValue(String metricName){
        Object value=null;
        value = subscriberMetrics.entrySet().stream().filter(mtrc-> mtrc.getKey().equalsIgnoreCase(metricName)).findFirst().map(Map.Entry::getValue).orElse(null);
        if(null == value){
            value = subscriptionMetrics.entrySet().stream().filter(mtrc-> mtrc.getKey().equalsIgnoreCase(metricName)).findFirst().map(Map.Entry::getValue).orElse(null);
        }
        if(null == value){
            value = productMetrics.entrySet().stream().filter(mtrc-> mtrc.getKey().equalsIgnoreCase(metricName)).findFirst().map(Map.Entry::getValue).orElse(null);
        }
        if(null == value){
            value = brandMetrics.entrySet().stream().filter(mtrc-> mtrc.getKey().equalsIgnoreCase(metricName)).findFirst().map(Map.Entry::getValue).orElse(null);
        }
        return value;
    }

    public void addToSubscriberMetrics(String key,Object value){
        subscriberMetrics.put(key,value);
    }

    public void addToSubscriptionMetrics(String key,Object value){
        subscriptionMetrics.put(key,value);
    }

    public void addToProductMetrics(String key,Object value){
        productMetrics.put(key,value);
    }

    public void addToBrandMetrics(String key,Object value){
        brandMetrics.put(key,value);
    }


}
