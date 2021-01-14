package com.ln.design.behavioral.interpreter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 10:56
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
