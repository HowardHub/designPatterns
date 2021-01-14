package com.ln.design.j2ee.intercepting_filter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:37
 **/
public class DebugFilter implements Filter {


    @Override
    public void execute(String request) {
        System.out.println("请求日志log: " + request);
    }
}
