package com.ln.design.structural.facade;

/**
 * @Description facade
 * @Author HeZhipeng
 * @Date 2021/1/12 0:06
 **/
public class ShapeMaker {

    private Circle circle;
    private Square square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }


    public void drawSquare(){
        square.draw();
    }



}
