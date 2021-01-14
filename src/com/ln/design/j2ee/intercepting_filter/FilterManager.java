package com.ln.design.j2ee.intercepting_filter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:39
 **/
public class FilterManager {

    FilterChain filterChain;

    public FilterManager (Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }

}
