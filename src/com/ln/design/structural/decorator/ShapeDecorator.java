package com.ln.design.structural.decorator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 15:44
 **/
public abstract class ShapeDecorator implements Shape{


    protected Shape shape; // 被装饰的对象

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }


    @Override
    public void draw() {
        shape.draw();
    }




}
