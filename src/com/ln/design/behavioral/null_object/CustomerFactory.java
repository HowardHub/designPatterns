package com.ln.design.behavioral.null_object;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:37
 **/
public class CustomerFactory {


    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }


}
