package com.ln.design.structural.adapter;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 17:16
 **/
public class Mp4Player implements AdvancedMediaPlayer{


    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
