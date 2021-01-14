package com.ln.design.creational.factory;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 10:20
 **/
public class FactoryPatternDemo {


    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        Shape rectangle = factory.getShape("Rectangle");
        Shape square = factory.getShape("Square");
        circle.draw();
        square.draw();
        rectangle.draw();
    }

}
