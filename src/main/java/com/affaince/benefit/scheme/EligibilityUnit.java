package com.affaince.benefit.scheme;

import java.util.LinkedList;
import java.util.List;

public class EligibilityUnit {
    private Expression expression;

    public EligibilityUnit() {
    }

    public void setExpression(Expression expression){
        this.expression=expression;
    }
    public void execute(BenefitSchemeContext benefitSchemeContext){
            if((Boolean)expression.apply()){
                benefitSchemeContext.setEligibleForScheme(true);
            }
    }
}
