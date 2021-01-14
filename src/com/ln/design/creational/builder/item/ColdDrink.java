package com.ln.design.creational.builder.item;

import com.ln.design.creational.builder.packing.Bottle;
import com.ln.design.creational.builder.packing.Packing;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 15:42
 **/
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
