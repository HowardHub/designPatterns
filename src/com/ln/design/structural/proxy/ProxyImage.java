package com.ln.design.structural.proxy;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/12 23:54
 **/
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;


    public ProxyImage(String fileName){
        this.fileName = fileName;
    }



    @Override
    public void display() {

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }










}
