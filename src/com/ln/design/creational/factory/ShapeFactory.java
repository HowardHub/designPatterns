package com.ln.design.creational.factory;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 10:18
 **/
public class ShapeFactory {


    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("Circle")) {
            return new Circle();
        } else if (shapeType.equals("Square")) {
            return new Square();
        } else if (shapeType.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }


}
