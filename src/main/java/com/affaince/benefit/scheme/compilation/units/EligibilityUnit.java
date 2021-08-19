package com.affaince.benefit.scheme.compilation.units;

import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.expressions.Expression;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
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

    public Expression getExpression() {
        return expression;
    }
}
