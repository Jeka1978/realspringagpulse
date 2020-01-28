package irobot_stuff;

import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

@Component
public final class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 3,max = 6)
    @Setter
    private int repeat;


    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVVvvvvvvvvvvvvvvvv");
        }
    }


}
