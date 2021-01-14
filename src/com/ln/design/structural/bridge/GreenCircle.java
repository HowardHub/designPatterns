package com.ln.design.structural.bridge;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/11 10:25
 **/
public class GreenCircle implements DrawAPI{


    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
