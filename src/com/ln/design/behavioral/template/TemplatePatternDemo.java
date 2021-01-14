package com.ln.design.behavioral.template;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:51
 **/
public class TemplatePatternDemo {


    public static void main(String[] args) {


        AbstractGame game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
