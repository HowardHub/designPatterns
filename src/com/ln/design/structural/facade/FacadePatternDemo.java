package com.ln.design.structural.facade;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/12 0:07
 **/
public class FacadePatternDemo {


    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();

    }

}
