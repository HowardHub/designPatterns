package com.ln.design.j2ee.service_locator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 15:18
 **/
public class ServiceLocatorPatternDemo {


    public static void main(String[] args){

        Service service = ServiceLocator.getService("ServiceImpl1");
        service.execute();
        service = ServiceLocator.getService("ServiceImpl2");
        service.execute();
        service = ServiceLocator.getService("ServiceImpl1");
        service.execute();
        service = ServiceLocator.getService("ServiceImpl2");
        service.execute();


    }


}
