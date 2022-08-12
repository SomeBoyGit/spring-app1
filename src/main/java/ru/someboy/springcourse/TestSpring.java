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

        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic3 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic4 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic5 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic6 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());
        System.out.println(classicalMusic3.getSong());
        System.out.println(classicalMusic4.getSong());
        System.out.println(classicalMusic5.getSong());
        System.out.println(classicalMusic6.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        firstMusicPlayer.setVolume(30);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
////        musicPlayer.playMusic();

        context.close();
    }
}
