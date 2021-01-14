package com.ln.design.behavioral.chain_of_responsibility;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 0:16
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("File console::logger:" + message);
    }
}
