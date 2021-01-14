package com.ln.design.creational.builder.item;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 15:46
 **/
public class Pepsi extends ColdDrink {


    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
