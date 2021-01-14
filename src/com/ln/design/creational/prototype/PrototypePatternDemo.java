package com.ln.design.creational.prototype;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 16:45
 **/
public class PrototypePatternDemo {



    public static void main(String[] args){
        // 很多框架用到了这种类型的代码
        ShapeCache.loadCache();

        Shape clonedShape1  = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2  = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3  = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());


    }

}
