package quoters;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class ChuckNorrisQuoter implements Quoter {
    @Autowired
    private Faker faker;
    @Override
    public void sayQuote() {
        System.out.println(faker.chuckNorris().fact());
    }
}
