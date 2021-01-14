package com.ln.design.structural.proxy;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/12 23:58
 **/
public class ProxyPatternDemo {


    public static void main(String[] args){

        Image proxyImage = new ProxyImage("abc.jpb");
        proxyImage.display(); // 图像将从磁盘加载
        System.out.println();
        proxyImage.display(); // 图像不需要从磁盘加载



    }


}
