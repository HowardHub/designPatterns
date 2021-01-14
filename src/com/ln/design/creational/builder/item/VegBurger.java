package com.ln.design.creational.builder.item;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 15:43
 **/
public class VegBurger extends Burger{


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
