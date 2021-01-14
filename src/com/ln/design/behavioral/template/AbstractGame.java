package com.ln.design.behavioral.template;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:49
 **/
public abstract class AbstractGame {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}
