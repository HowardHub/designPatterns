package com.ln.design.j2ee.front_controller;

/**
 * @Description 调度器 Dispatcher。
 * @Author HeZhipeng
 * @Date 2021/1/14 11:00
 **/
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }

}
