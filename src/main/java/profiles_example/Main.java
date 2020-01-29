package profiles_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Main {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "NESS,MATRIX");
        //spring.profiles.active = MATRIX
        new AnnotationConfigApplicationContext(Main.class);
    }
}
