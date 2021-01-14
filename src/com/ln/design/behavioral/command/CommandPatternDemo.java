package com.ln.design.behavioral.command;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 0:35
 **/
public class CommandPatternDemo {



    public static void main(String[] args){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);


        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();



    }


}
