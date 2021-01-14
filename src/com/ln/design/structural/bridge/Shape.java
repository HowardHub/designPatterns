package com.ln.design.structural.bridge;

/**
 * @Description 使用 DrawAPI 接口创建抽象类 Shape
 * @Author HeZhipeng
 * @Date 2021/1/11 10:26
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();



}
