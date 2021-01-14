package com.ln.design.behavioral.observer;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:05
 **/
public class HexaObserver extends Observer {


    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }


}
