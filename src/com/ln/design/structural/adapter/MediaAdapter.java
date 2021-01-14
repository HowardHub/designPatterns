package com.ln.design.structural.adapter;

import java.rmi.NoSuchObjectException;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 17:17
 **/
public class MediaAdapter implements MediaPlayer{



    AdvancedMediaPlayer advancedMediaPlayer;



    public MediaAdapter(String audioType){
        if (audioType.equals("MP4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equals("VLC")) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }


    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equals("MP4")) {
           advancedMediaPlayer.playMP4(fileName);
        } else if (audioType.equals("VLC")) {
           advancedMediaPlayer.playVlc(fileName);
        }
    }




}
