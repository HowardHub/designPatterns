package com.ln.design.behavioral.template;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:50
 **/
public class Football extends AbstractGame{


    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
