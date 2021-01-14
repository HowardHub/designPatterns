package com.ln.design.behavioral.mediator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 15:49
 **/
public class User {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }

}
