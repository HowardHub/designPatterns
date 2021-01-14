package com.ln.design.behavioral.memento;

/**
 * @Description Originator 创建并在 Memento 对象中存储状态。
 * @Author HeZhipeng
 * @Date 2021/1/13 16:00
 **/
public class Originator {

    private String state;


    public void setState(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }


    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }



}
