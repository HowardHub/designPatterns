package com.ln.design.behavioral.observer;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:05
 **/
public class OctalObserver extends Observer {


    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }


}
