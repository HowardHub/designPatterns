package com.ln.design.structural.proxy;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/12 23:52
 **/
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }



    public void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }




}
