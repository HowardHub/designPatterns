package com.ln.design.creational.builder.item;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 15:45
 **/
public class Coke extends ColdDrink {


    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
