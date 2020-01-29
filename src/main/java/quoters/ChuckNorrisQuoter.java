package quoters;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Film
@Book
public class ChuckNorrisQuoter implements Quoter {
    @Autowired
    private Faker faker;

    @Override
    public void sayQuote() {
        System.out.println(faker.chuckNorris().fact());
    }
}
