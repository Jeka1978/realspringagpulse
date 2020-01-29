package qualifiers_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@AgpulseRepo(DBMode.BACKUP)
public class PostgresDao implements Dao {
    @Override
    public void saveTheWorld() {
        System.out.println("save to Postgres");
    }
}
