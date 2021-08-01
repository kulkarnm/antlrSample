package com.affaince.benefit.scheme;


public class VariableIdentifierExpression extends Expression {
    private String identifier;
    public VariableIdentifierExpression(String identifier) {
        super(null,null,null);
        this.identifier=identifier;
    }

    @Override
    public Object apply() {
        //return  (scheme)-> scheme.getGivenUnit().searchVariableExpression(identifier).apply();
        return identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
