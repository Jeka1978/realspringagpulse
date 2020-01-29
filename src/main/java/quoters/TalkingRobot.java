package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobot {

    @Film
    private List<Quoter> quoters = asList(() -> System.out.println("this is default quote"));



    @EventListener(ContextRefreshedEvent.class)
    public void talk(){
        quoters.forEach(Quoter::sayQuote);
    }
}







