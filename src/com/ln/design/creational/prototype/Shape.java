package com.ln.design.creational.prototype;

/**
 * @Description 创建一个实现了 Cloneable 接口的抽象类。
 * @Author HeZhipeng
 * @Date 2021/1/8 16:34
 **/
public abstract class Shape implements Cloneable{

    private String id;

    protected String type;


    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone()  {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
