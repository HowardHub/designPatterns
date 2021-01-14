package com.ln.design.creational.abstract_factory;

/**
 * @Description 工厂创造器
 * @Author HeZhipeng
 * @Date 2021/1/8 10:40
 **/
public class FactoryProducer {

    public AbstractFacotry getFactory(String factoryType){
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equals("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equals("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }



}
