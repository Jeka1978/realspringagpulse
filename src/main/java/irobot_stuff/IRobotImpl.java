package irobot_stuff;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @author Evgeny Borisov
 */

@Setter
@Component
public final class IRobotImpl implements IRobot {
    @Autowired
    private Speaker speaker;
    @Autowired
    private Cleaner cleaner;
    @Value("${start.message}")
    private String startMessage;

    private String endMessage;

    @Value("${end.message}")
    public void setMessage(String msg) {
        endMessage = msg.toLowerCase();
    }

    @Value("${JAVA_HOME}")
    public void setStam(String javaHome) {
        System.out.println("javaHome = " + javaHome);
    }

    @Autowired
    public void checkEnv(Environment environment) {
        System.out.println(environment.getProperty("M2_HOME"));
    }

    public void stamInit() {
        System.out.println(cleaner.getClass().getSimpleName());
    }


    @Override
//    @Scheduled(fixedDelay = 500)
    public void cleanRoom() {
        speaker.speak(startMessage);
        cleaner.clean();
        speaker.speak(endMessage);
    }

    @PreDestroy
    public void killMySelf() {
        new Thread(() -> System.out.println("The life was good")).start();
    }
}
