package com.affaince.benefit;

import com.affaince.benefit.scheme.Expression;

public class GivenExpressionBuilder {

    public Expression buildGivenExpression(BenefitParser.GivenUnitContext ctx){
        if(ctx.GIVEN().getText() == "given"){
            ctx.givenBody().block().blockStatement().stream().forEach(stmt->{
                BenefitParser.VariableDeclarationStatementContext variableDeclarationStatementContext = stmt.variableDeclarationStatement();
                if(null !=variableDeclarationStatementContext){
                    String variableName = variableDeclarationStatementContext.variableDeclaratorId().getText();
                    if(null != variableDeclarationStatementContext.ASSIGN()){   //assignment statement
                       BenefitParser.VariableInitializerContext variableInitializerContext = variableDeclarationStatementContext.variableInitializer();
                       if(null!=variableInitializerContext.arrayInitializer()){ //variable is an array, so rhs will be array initialization block
                            BenefitParser.ArrayInitializerContext arrayInitializerContext = variableInitializerContext.arrayInitializer();
                            //TODO
                       }else{       //if not array then it should be a simple constant assignment or an expression
                            BenefitParser.ExpressionContext expressionContext = variableInitializerContext.expression();

                       }
                    }else{          //input statement

                    }
                }else{
                    throw new RuntimeException("No VariableDeclaration");
                }
            });
        }else{
            throw new RuntimeException("No GIVEN");
        }
        return null;
    }


}
