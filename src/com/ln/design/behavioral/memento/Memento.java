package com.ln.design.behavioral.memento;

/**
 * @Description Memento 包含了要被恢复的对象的状态。
 * @Author HeZhipeng
 * @Date 2021/1/13 15:57
 **/
public class Memento {


    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
