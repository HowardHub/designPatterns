package com.ln.design.creational.abstract_factory;

/**
 * @Description 抽象工厂
 * @Author HeZhipeng
 * @Date 2021/1/8 10:36
 **/
public abstract class AbstractFacotry {

    public abstract  Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);

}
