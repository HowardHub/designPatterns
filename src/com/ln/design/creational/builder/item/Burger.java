package com.ln.design.creational.builder.item;

import com.ln.design.creational.builder.packing.Packing;
import com.ln.design.creational.builder.packing.Wrapper;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 15:40
 **/
public abstract class Burger implements Item{


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 0;
    }
}
