package com.ln.design.j2ee.intercepting_filter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:41
 **/
public class InterceptingFilterDemo {


    public static void main(String[] args){
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());


        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");

    }


}
