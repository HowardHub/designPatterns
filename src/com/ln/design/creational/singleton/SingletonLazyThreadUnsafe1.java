package com.ln.design.creational.singleton;

/**
 * 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 不推荐使用
 * @Description 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @Author HeZhipeng
 * @Date 2021/1/8 15:13
 **/
public class SingletonLazyThreadUnsafe1 {

    private static SingletonLazyThreadUnsafe1 instance;
    private SingletonLazyThreadUnsafe1(){

    }
    public static SingletonLazyThreadUnsafe1 getInstance(){
        if (instance == null) {
            instance = new SingletonLazyThreadUnsafe1();
        }
        return instance;
    }



}
