package com.ln.design.behavioral.chain_of_responsibility;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 0:07
 **/
public abstract class AbstractLogger {

    public static int ERROR = 3;
    public static int INFO = 1;
    public static int DEBUG = 2;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String message);



}
