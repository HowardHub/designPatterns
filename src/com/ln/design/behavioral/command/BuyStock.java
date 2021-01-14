package com.ln.design.behavioral.command;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 0:31
 **/
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }


}
