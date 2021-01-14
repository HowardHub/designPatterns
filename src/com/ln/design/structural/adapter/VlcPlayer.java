package com.ln.design.structural.adapter;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 17:16
 **/
public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
