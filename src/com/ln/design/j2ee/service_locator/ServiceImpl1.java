package com.ln.design.j2ee.service_locator;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:12
 **/
public class ServiceImpl1 implements Service{


    @Override
    public String getName() {
        return "ServiceImpl1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
