package com.ln.design.creational.prototype;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 16:37
 **/
public class Rectangle extends Shape{


    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }


}
