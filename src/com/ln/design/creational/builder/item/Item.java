package com.ln.design.creational.builder.item;

import com.ln.design.creational.builder.packing.Packing;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 15:38
 **/
public interface Item {

    String name();
    Packing packing();
    float price();

}
