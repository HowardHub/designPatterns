package com.ln.design.creational.prototype;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 16:39
 **/
public class Square extends Shape{


    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }


}
