package com.ln.design.behavioral.interpreter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 10:56
 **/
public class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;
    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
