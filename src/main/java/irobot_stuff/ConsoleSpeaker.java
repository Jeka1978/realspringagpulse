
package irobot_stuff;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
