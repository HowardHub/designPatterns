package com.ln.design.structural.flyweight;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/12 0:14
 **/
public class Circle implements Shape {

    private int x;
    private int y;
    private int radius;

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        x = x;
    }


    public void setY(int y) {
        y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
