package ru.someboy.springcourse;

/**
 * @author Slipets Artem
 */
public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
