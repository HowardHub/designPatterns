package com.ln.design.behavioral.mediator;

import java.util.Date;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 14:34
 **/
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }




}
