package com.ln.design.behavioral.observer;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:04
 **/
public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }



}
