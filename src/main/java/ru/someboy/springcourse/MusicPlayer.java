package ru.someboy.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Slipets Artem
 */
public class MusicPlayer {
    private List<Music> music = new ArrayList<>();

    private String name;
    private int volume;
    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusicList() {
        music.forEach(melody -> System.out.println("Playing: " + melody.getSong()));
    }
}
