package com.ln.design.behavioral.chain_of_responsibility;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 0:15
 **/
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error Console::logger:" + message );
    }
}
