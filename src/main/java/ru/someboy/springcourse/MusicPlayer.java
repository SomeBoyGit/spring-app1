package ru.someboy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Slipets Artem
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    public String playMusic() {
//        return "Playing: " + music1.getSong() + " ," + music2.getSong();
//    }
    public String playMusic(Genre genre) {
        Random random = new Random();
        int trackNumber = random.nextInt(3);
        if(genre == Genre.CLASSICAL) {
            System.out.println("Playing: " + Genre.CLASSICAL);
            return music2.getSong()[trackNumber];
        }
        else {
            System.out.println("Playing: " + Genre.ROCK);
            return music1.getSong()[trackNumber];
        }
    }
}
