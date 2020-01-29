package quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Book
public class ShakeSpearQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("2 b || ! 2 b");
    }
}
