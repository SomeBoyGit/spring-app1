package ru.someboy.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * @author Slipets Artem
 */
public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int random = new Random().nextInt(3);

        return "Playing: " + musicList.get(random).getSong();
    }
}
