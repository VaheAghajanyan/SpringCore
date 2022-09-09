package com.synisys;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        /*TestBean testBean = applicationContext.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        applicationContext.close();*/

        Music classicalMusic = applicationContext.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic); // First way - manual
        MusicPlayer musicPlayer1 = applicationContext.getBean("musicPlayer", MusicPlayer.class); // Second way - Using Dependency Injection
        MusicPlayer musicPlayer2 = applicationContext.getBean("musicPlayerWithSetter", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
    }
}
