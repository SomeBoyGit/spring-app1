package ru.someboy.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Slipets Artem
 */
@Component
public class RockMusic implements Music {
    private String[] rockMusicList = {"Wind cries Mary", "Highway to Hell", "Smells Like Teen Spirit"};
    public String[] getSong() {
        return rockMusicList;
    }
}
