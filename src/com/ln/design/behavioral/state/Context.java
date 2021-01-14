package com.ln.design.behavioral.state;

/**
 * @Description 带有某个状态的类
 * @Author HeZhipeng
 * @Date 2021/1/13 17:22
 **/
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context() {
        state = null;
    }
}
