package com.affaince.benefits.scheme;


import java.util.Map;

public class BenefitSchemeContext {
    private BenefitsProcessingContext benefitsProcessingContext;
    private BenefitOutputContext benefitOutputContext;

    public BenefitSchemeContext(){
        benefitsProcessingContext= new BenefitsProcessingContext();
        benefitOutputContext=new BenefitOutputContext();
    }

    public void addToInputVariables(String variableName, Object value) {
        benefitsProcessingContext.addToIntermediateVariables(variableName, value);
    }

    public void addToComputedVariables(String variableName, Object value) {
        benefitsProcessingContext.addToIntermediateVariables(variableName, value);
    }
    public void setEligibleForScheme(boolean isEligible){
        this.benefitOutputContext.setEligibleForScheme(isEligible);
    }
    public void addToBenefitVestingDistributionList(double deliveryNumber,double benefitValueToBeVested){
        this.benefitOutputContext.addToBenefitVestingDistributionList(deliveryNumber,benefitValueToBeVested);
    }
    public void setBefore(boolean isBefore){
        this.benefitOutputContext.setBefore(isBefore);
    }
    public Boolean getEligibleForScheme(){
        return this.benefitOutputContext.getEligibleForScheme();
    }
    public void setBenefitValue(Double benefitValue){
        benefitOutputContext.setBenefitValue(benefitValue);
    }
    public Object searchVariableValue(String variableName) {
        return benefitsProcessingContext.findValue(variableName);
    }

    public BenefitsProcessingContext getBenefitsProcessingContext() {
        return benefitsProcessingContext;
    }

    public void setBenefitsProcessingContext(BenefitsProcessingContext benefitsProcessingContext) {
        this.benefitsProcessingContext = benefitsProcessingContext;
    }

    public BenefitOutputContext getBenefitOutputContext() {
        return benefitOutputContext;
    }

    public void setBenefitOutputContext(BenefitOutputContext benefitOutputContext) {
        this.benefitOutputContext = benefitOutputContext;
    }
    public Map<String, Object> getIntermediateVariables() {
        return benefitsProcessingContext.getIntermediateVariables();
    }

}
