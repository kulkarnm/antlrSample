package com.affaince.benefit.scheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BenefitSchemeContext {

    private BenefitInputContext benefitInputContext;
    private BenefitOutputContext benefitOutputContext;

    public BenefitSchemeContext(){
        benefitInputContext= new BenefitInputContext();
        benefitOutputContext=new BenefitOutputContext();
    }

    public void addToInputVariables(String variableName,Object value){
        this.benefitInputContext.addToInputVariables(variableName,value);
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

    public BenefitInputContext getBenefitInputContext() {
        return benefitInputContext;
    }

    public BenefitOutputContext getBenefitOutputContext() {
        return benefitOutputContext;
    }
    public Boolean getEligibleForScheme(){
        return this.benefitOutputContext.getEligibleForScheme();
    }
    public void setBenefitValue(Double benefitValue){
        benefitOutputContext.setBenefitValue(benefitValue);
    }
    public Object searchVariableValue(String variableName){
        return benefitInputContext.searchVariableValue(variableName);
    }
    public class BenefitInputContext{
        private Map<String,Object> inputVariables;
        BenefitInputContext(){
            inputVariables = new HashMap<>();
        }

        public Map<String, Object> getInputVariables() {
            return inputVariables;
        }
        public Object getInputVariable(String variableName){
            return this.inputVariables.get(variableName);
        }

        public void addToInputVariables(String variableName,Object value){
            inputVariables.put(variableName,value);
        }
        public Object searchVariableValue(String variableName){
            return inputVariables.entrySet().stream().filter(var->var.getKey().equals(variableName)).findAny().get().getValue();
        }
    }
    public class BenefitOutputContext{
        private Boolean isEligibleForScheme;
        private double benefitValue;
        private boolean isBefore;
        private List<BenefitVestingDistribution> benefitVestingDistributionList;

        BenefitOutputContext(){
            benefitVestingDistributionList = new ArrayList<>();
            isEligibleForScheme=false;
        }

        public Boolean getEligibleForScheme() {
            return isEligibleForScheme;
        }

        public boolean isBefore() {
            return isBefore;
        }

        public void setBefore(boolean before) {
            isBefore = before;
        }

        public void setEligibleForScheme(Boolean eligibleForScheme) {
            isEligibleForScheme = eligibleForScheme;
        }

        public double getBenefitValue() {
            return benefitValue;
        }

        public void setBenefitValue(double benefitValue) {
            this.benefitValue = benefitValue;
        }

        public List<BenefitVestingDistribution> getBenefitVestingDistributionList() {
            return benefitVestingDistributionList;
        }

        public void setBenefitVestingDistributionList(List<BenefitVestingDistribution> benefitVestingDistributionList) {
            this.benefitVestingDistributionList = benefitVestingDistributionList;
        }
        public void addToBenefitVestingDistributionList(double deliveryNumber,double benefitValueToBeVested){
            BenefitVestingDistribution benefitVestingDistribution= new BenefitVestingDistribution(deliveryNumber,benefitValueToBeVested);
            this.benefitVestingDistributionList.add(benefitVestingDistribution);
        }
        public class BenefitVestingDistribution{
            private double deliveryNumber;
            private double benefitValueToBeVested;

            public BenefitVestingDistribution(double deliveryNumber, double benefitValueToBeVested) {
                this.deliveryNumber = deliveryNumber;
                this.benefitValueToBeVested = benefitValueToBeVested;
            }

            public double getDeliveryNumber() {
                return deliveryNumber;
            }

            public double getBenefitValueToBeVested() {
                return benefitValueToBeVested;
            }
        }
    }
}
