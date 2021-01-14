package com.ln.design.behavioral.command;

/**
 * @Description 作为请求的 Stock 类
 * @Author HeZhipeng
 * @Date 2021/1/13 0:30
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }


}
