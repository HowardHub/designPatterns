package com.ln.design.behavioral.state;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:21
 **/
public class StopState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
