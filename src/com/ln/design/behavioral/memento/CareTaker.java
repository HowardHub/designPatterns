package com.ln.design.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Caretaker 对象负责从 Memento 中恢复对象的状态。
 * @Author HeZhipeng
 * @Date 2021/1/13 15:58
 **/
public class CareTaker {


    private List<Memento> mementoList = new ArrayList<>();


    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }


}
