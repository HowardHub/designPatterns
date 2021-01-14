package com.ln.design.j2ee.intercepting_filter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:40
 **/
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
