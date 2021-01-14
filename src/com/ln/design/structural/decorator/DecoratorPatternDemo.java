package com.ln.design.structural.decorator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/12 0:02
 **/
public class DecoratorPatternDemo {




    public static void main(String[] args){

        ShapeDecorator decorator = new RedShapeDecorator(new Circle());
        decorator.draw();




    }





}
