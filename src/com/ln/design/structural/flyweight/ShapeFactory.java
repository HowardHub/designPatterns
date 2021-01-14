package com.ln.design.structural.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/12 0:27
 **/
public class ShapeFactory {


    private static final HashMap<String, Shape> circleMap = new HashMap<>();




    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);

        }
        return circle;
    }







}
