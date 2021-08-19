package com.affaince.benefit.scheme;

import com.affaince.benefit.scheme.compilation.units.ComputeUnit;
import com.affaince.benefit.scheme.compilation.units.EligibilityUnit;
import com.affaince.benefit.scheme.compilation.units.GivenUnit;
import com.affaince.benefit.scheme.compilation.units.PayUnit;
import com.affaince.benefit.scheme.expressions.Expression;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Scheme {
    private GivenUnit givenUnit;
    private ComputeUnit computeUnit;
    private EligibilityUnit eligibilityUnit;
    private PayUnit payUnit;
    private CommonInputContext commonInputContext;

    public Scheme() {
        givenUnit = new GivenUnit();
        computeUnit = new ComputeUnit();
        eligibilityUnit= new EligibilityUnit();
        payUnit=new PayUnit();
    }

    public Expression searchVariableExpression(String variableName){
        Expression expression = this.getGivenUnit().searchVariableExpression(variableName);
        if(null !=expression){
            return expression;
        }else{
            expression = this.getComputeUnit().searchVariableExpression(variableName);
            if(null != expression){
                return expression;
            }else{
                expression = this.getPayUnit().searchVariableExpression(variableName);
                if(null != expression) {
                    return expression;
                }
            }
        }
        return null;
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
