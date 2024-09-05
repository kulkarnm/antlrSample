package com.affaince.benefits.scheme;

import java.util.ArrayList;
import java.util.List;

public class BenefitOutputContext {
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
