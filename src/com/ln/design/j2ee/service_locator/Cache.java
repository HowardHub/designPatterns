package com.ln.design.j2ee.service_locator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:15
 **/
public class Cache {


    private List<Service> services;

    public Cache(){
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }


    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }

        if (!exists) {
            services.add(newService);
        }
    }


}
