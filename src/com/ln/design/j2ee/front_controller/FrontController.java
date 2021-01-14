package com.ln.design.j2ee.front_controller;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 11:01
 **/
public class FrontController {


    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("用户授权成功.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("网页请求： " + request);
    }

    public void dispatchRequest(String request) {
        // 记录每一个请求
        trackRequest(request);

        // 对用户进行身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }



}
