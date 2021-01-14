package com.ln.design.behavioral.mediator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 15:50
 **/
public class MediatorPatternDemo {



    public static void main(String[] args){

        User jack = new User("jack");
        User rose = new User("rose");

        jack.sendMessage("今晚过来吃饭");

        rose.sendMessage("好的");

    }




}
