package lazy_examples;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public final class Launcher {
    public void shoot() {
        System.out.println("die harot");
    }

    @PostConstruct
    public void init(){
        System.out.println("The most expensive launcher was delivered");
    }
}
