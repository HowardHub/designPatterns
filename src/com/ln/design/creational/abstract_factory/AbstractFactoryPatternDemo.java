package com.ln.design.creational.abstract_factory;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 10:52
 **/
public class AbstractFactoryPatternDemo {


    public static void main(String[] args){

        FactoryProducer producer = new FactoryProducer();
        AbstractFacotry shapeFactory = producer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("Circle");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        circle.draw();
        rectangle.draw();
        square.draw();

        AbstractFacotry colorFactory = producer.getFactory("COLOR");
        Color red = colorFactory.getColor("Red");
        Color blue = colorFactory.getColor("Blue");
        Color green = colorFactory.getColor("Green");
        red.fill();
        blue.fill();
        green.fill();



    }

}
