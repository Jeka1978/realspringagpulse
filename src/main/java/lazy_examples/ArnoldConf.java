package lazy_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class ArnoldConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ArnoldConf.class);
        context.getBean(Arnold.class).killEnemies(3);
    }
}
