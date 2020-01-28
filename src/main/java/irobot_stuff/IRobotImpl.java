package irobot_stuff;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */

@Setter
public final class IRobotImpl implements IRobot  {
    private Speaker speaker;
    private Cleaner cleaner;

    public void stamInit(){
        System.out.println(cleaner.getClass().getSimpleName());
    }


    @Override
    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
