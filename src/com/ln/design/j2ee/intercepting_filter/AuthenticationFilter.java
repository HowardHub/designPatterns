package com.ln.design.j2ee.intercepting_filter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:36
 **/
public class AuthenticationFilter implements Filter {


    @Override
    public void execute(String request) {
        System.out.println("授权认证 request=" + request);
    }
}
