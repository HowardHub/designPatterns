package com.ln.design.creational.singleton;

/**
 * 2、懒汉式，线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 不推荐使用
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 *
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 15:15
 **/
public class SingletonLazyThreadSafe2 {

    private static SingletonLazyThreadSafe2 instance;

    private SingletonLazyThreadSafe2(){}


    public static synchronized SingletonLazyThreadSafe2 getInstance(){
        if (instance == null) {
            return instance;
        }
        return instance;
    }



}
