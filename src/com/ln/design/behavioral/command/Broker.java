package com.ln.design.behavioral.command;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 作为调用对象的类 Broker
 * @Author HeZhipeng
 * @Date 2021/1/13 0:33
 **/
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrder(){
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }





}
