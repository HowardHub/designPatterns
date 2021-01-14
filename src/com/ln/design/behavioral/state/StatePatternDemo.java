package com.ln.design.behavioral.state;

import javafx.scene.paint.Stop;

/**
 * @Description 使用 Context 和状态对象来演示 Context 在状态改变时的行为变化
 * @Author HeZhipeng
 * @Date 2021/1/13 17:23
 **/
public class StatePatternDemo {


    public static void main(String[] args){

        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }




}
