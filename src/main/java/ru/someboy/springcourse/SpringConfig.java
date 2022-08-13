package ru.someboy.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Slipets Artem
 */
@Configuration
@ComponentScan("ru.someboy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
