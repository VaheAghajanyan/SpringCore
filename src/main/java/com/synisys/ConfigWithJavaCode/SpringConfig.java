package com.synisys.ConfigWithJavaCode;

import com.synisys.ClassicalMusic;
import com.synisys.MusicPlayer;
import com.synisys.RockMusic;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.synisys")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic());
    }


}
