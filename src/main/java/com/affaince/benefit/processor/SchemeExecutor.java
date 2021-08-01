package com.affaince.benefit.processor;

import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.EligibilityUnit;
import com.affaince.benefit.scheme.Expression;
import com.affaince.benefit.scheme.Scheme;

import java.util.List;

public class SchemeExecutor {
    private BenefitSchemeContext benefitSchemeContext;

    public SchemeExecutor(){
        this.benefitSchemeContext = new BenefitSchemeContext();
    }

    public BenefitSchemeContext executeScheme(Scheme scheme){
        scheme.getGivenUnit().execute(benefitSchemeContext);
        scheme.getEligibilityUnit().execute(benefitSchemeContext);
        System.out.println("eligibility :" + benefitSchemeContext.getEligibleForScheme());
        if(benefitSchemeContext.getEligibleForScheme()){
            scheme.getComputeUnit().execute(benefitSchemeContext);
            scheme.getPayUnit().execute(benefitSchemeContext);
        }
        return this.benefitSchemeContext;
    }



}
