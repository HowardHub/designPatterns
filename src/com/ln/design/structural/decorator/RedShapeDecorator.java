package com.ln.design.structural.decorator;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/11 15:45
 **/
public class RedShapeDecorator extends ShapeDecorator{


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }


    /**
     * 增加的功能
     */
    private void setRedBorder(){
        System.out.println("给图形加红边装饰。");
    }



}
