package com.ln.design.j2ee.intercepting_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/14 10:38
 **/
public class FilterChain {


    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

}
