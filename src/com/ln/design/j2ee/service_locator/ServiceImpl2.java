package com.ln.design.j2ee.service_locator;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:13
 **/
public class ServiceImpl2 implements Service {


    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
