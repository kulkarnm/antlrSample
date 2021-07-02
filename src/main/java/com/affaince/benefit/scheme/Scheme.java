package com.affaince.benefit.scheme;

public class Scheme {
    private GivenUnit givenUnit;
    private ComputeUnit computeUnit;
    private EligibilityUnit eligibilityUnit;
    private PayUnit payUnit;

    public Scheme() {
    }

    public GivenUnit getGivenUnit() {
        return givenUnit;
    }

    public void setGivenUnit(GivenUnit givenUnit) {
        this.givenUnit = givenUnit;
    }

    public ComputeUnit getComputeUnit() {
        return computeUnit;
    }

    public void setComputeUnit(ComputeUnit computeUnit) {
        this.computeUnit = computeUnit;
    }

    public EligibilityUnit getEligibilityUnit() {
        return eligibilityUnit;
    }

    public void setEligibilityUnit(EligibilityUnit eligibilityUnit) {
        this.eligibilityUnit = eligibilityUnit;
    }

    public PayUnit getPayUnit() {
        return payUnit;
    }

    public void setPayUnit(PayUnit payUnit) {
        this.payUnit = payUnit;
    }
}
