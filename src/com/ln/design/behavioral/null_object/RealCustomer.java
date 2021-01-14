package com.ln.design.behavioral.null_object;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:36
 **/
public class RealCustomer extends AbstractCustomer {


    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }



}
