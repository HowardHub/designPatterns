package com.ln.design.structural.adapter;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 17:23
 **/
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if (audioType.equals("MP3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        } else if (audioType.equals("MP4") || audioType.equals("VLC")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }

    }



}
