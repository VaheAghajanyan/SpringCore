package com.synisys;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicType.CLASSICAL);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        applicationContext.close();
    }
}
