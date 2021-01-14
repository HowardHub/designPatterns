package com.ln.design.j2ee.composite_entity;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:04
 **/
public class CompositeEntity {


    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
