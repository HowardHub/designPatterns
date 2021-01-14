package com.ln.design.behavioral.strategy;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:45
 **/
public class Context {

    private Strategy strategy;


    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }


}
