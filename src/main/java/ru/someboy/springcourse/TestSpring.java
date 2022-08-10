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

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
