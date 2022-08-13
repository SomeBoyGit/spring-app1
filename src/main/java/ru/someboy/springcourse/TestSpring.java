package ru.someboy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Slipets Artem
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Genre.ROCK);
        musicPlayer.playMusic(Genre.CLASSICAL);
        context.close();
    }
}
