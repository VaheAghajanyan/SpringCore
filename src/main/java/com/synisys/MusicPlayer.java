package com.synisys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic music1,
                       @Qualifier("rockMusic") RockMusic music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public void playMusic(MusicType musicType) {
        switch (musicType) {
            case CLASSICAL:
                classicalMusic.getSong().forEach(System.out::println);
                break;
            case ROCK:
                rockMusic.getSong().forEach(System.out::println);
                break;
            default:
                System.out.println("Wrong music type.");
        }
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }
}
