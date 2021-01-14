package com.ln.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 16:57
 **/
public class Subject {


    private List<Observer> observers = new ArrayList<>();

    private int state;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }


    public void attach(Observer observer){
        observers.add(observer);
    }


    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }



}
