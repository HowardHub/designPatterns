package com.ln.design.creational.prototype;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 16:40
 **/
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }


    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }


}
