package com.ln.design.behavioral.strategy;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:45
 **/
public class OperationMultiply implements Strategy {


    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
