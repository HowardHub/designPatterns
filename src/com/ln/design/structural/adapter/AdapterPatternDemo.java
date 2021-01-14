package com.ln.design.structural.adapter;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/8 17:43
 **/
public class AdapterPatternDemo {

    public static void main(String[] args){

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("MP4", "晴天.mp4");
        audioPlayer.play("MP3", "十面埋伏.mp3");
        audioPlayer.play("VLC", "lover.vlc");
    }

}
