package com.ln.design.creational.abstract_factory;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 10:39
 **/
public class ColorFactory extends AbstractFacotry{


    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equals("Red")) {
            return new Red();
        } else if (colorType.equals("Blue")) {
            return new Blue();
        } else if (colorType.equals("Green")) {
            return new Green();
        }
        return null;
    }
}
