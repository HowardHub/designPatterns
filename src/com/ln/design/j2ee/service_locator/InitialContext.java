package com.ln.design.j2ee.service_locator;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 15:13
 **/
public class InitialContext {

    public Object lookup(String jndiName) {
        
        if (jndiName.equalsIgnoreCase("SERVICEIMPL1")) {
            System.out.println("Looking up and creating a new ServiceImpl1 object");
            return new ServiceImpl1();
        } else if(jndiName.equalsIgnoreCase("SERVICEIMPL2")) {
            System.out.println("Looking up and creating a new ServiceImpl2 object");
            return new ServiceImpl2();
        }
        

        return null;
    }

    
    
}
