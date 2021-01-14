package com.ln.design.behavioral.chain_of_responsibility;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 0:10
 **/
public class ConsoleLogger extends AbstractLogger {


   public ConsoleLogger(int level){
       this.level = level;
   }

    @Override
    public void write(String message) {
        System.out.println("Standard Console::logger:" + message);
    }
}
