package quoters;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

@Configuration
@ComponentScan
@PropertySource("classpath:quotes.properties")
public class QuoterConf {

    @Bean
    public Faker faker(){
        return new Faker();
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuoterConf.class);
//        context.getBeansWithAnnotation(Service.class)
    }











}
