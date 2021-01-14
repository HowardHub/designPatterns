package com.ln.design.j2ee.front_controller;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 11:03
 **/
public class FrontControllerPatternDemo {

    public static void main(String[] args){

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOMW");
        frontController.dispatchRequest("STUDENT");

    }

}
