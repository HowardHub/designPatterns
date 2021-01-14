package com.ln.design.j2ee.composite_entity;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:05
 **/
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
