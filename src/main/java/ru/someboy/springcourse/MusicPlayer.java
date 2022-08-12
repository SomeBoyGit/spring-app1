package ru.someboy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Slipets Artem
 */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    //    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }
//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//    }
    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + " Playing: " + rockMusic.getSong();
    }
}
