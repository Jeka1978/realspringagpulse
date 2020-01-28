package lazy_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Arnold {

    private final Logg logg;

    @Lazy
    private final Launcher launcher;

    public Arnold(Logg logg, Launcher launcher) {
        this.logg = logg;
        this.launcher = launcher;
    }

    public void killEnemies(int amount){
        System.out.println(launcher.getClass());
        if (amount < 100) {
            logg.kick();
        }else {
            launcher.shoot();
        }
    }
}
