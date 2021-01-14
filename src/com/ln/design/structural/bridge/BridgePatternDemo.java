package com.ln.design.structural.bridge;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 10:42
 **/
public class BridgePatternDemo {



    public static void main(String[] args){



        Shape greenCircle = new Circle(0,0,10,new GreenCircle());
        Shape redCircle = new Circle(0,0,10,new RedCircle());
        greenCircle.draw();
        redCircle.draw();




    }




}
