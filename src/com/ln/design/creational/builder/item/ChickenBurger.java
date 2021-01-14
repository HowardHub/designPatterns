package com.ln.design.creational.builder.item;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 15:44
 **/
public class ChickenBurger extends  Burger{


    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
