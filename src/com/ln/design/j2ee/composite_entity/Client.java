package com.ln.design.j2ee.composite_entity;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:05
 **/
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
