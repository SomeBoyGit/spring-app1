package ru.someboy.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Slipets Artem
 */
@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    private final String[] classicalMusicList = {"Hungarian Rhapsody", "No Rules", "The Seasons"};
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public String[] getSong() {
        return classicalMusicList;
    }
}
