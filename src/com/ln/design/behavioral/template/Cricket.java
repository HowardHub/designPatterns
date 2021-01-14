package com.ln.design.behavioral.template;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:50
 **/
public class Cricket extends AbstractGame {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

}
