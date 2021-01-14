package com.ln.design.behavioral.command;


/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 0:32
 **/
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
