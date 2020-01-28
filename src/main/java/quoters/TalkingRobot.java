package quoters;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobot {

    @Autowired
    private List<Quoter> quoters;

    public void talk(){
        quoters.forEach(Quoter::sayQuote);
    }
}
