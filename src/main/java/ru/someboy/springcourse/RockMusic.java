package ru.someboy.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Slipets Artem
 */
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
