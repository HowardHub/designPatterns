package com.ln.design.structural.decorator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 15:42
 **/
public class Circle implements Shape{


    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
