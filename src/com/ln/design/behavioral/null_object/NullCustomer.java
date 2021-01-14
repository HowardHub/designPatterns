package com.ln.design.behavioral.null_object;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:36
 **/
public class NullCustomer extends AbstractCustomer {


    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
