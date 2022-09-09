package com.synisys;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String text;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){

    };

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setMusicList(List<Music> list) {
        this.musicList = list;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }
}
