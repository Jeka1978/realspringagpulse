
package irobot_stuff;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
