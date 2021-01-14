package com.ln.design.j2ee.service_locator;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:17
 **/
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }


}
