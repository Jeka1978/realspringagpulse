package qualifiers_example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@AgpulseRepo(DBMode.PROD)
//@Primary
public class MongoDao implements Dao {
    @Override
    public void saveTheWorld() {
        System.out.println("save to Mongo");
    }
}
