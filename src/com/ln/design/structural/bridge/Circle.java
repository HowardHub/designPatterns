package com.ln.design.structural.bridge;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 10:27
 **/
public class Circle extends Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw() {
        this.drawAPI.drawCircle(x, y, radius);

    }







}
