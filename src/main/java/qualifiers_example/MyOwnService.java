package qualifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyOwnService {

    @AgpulseRepo(DBMode.PROD)
    private Dao mainDao;

    @AgpulseRepo(DBMode.BACKUP)
    private Dao backupDao;


    @Scheduled(fixedDelay = 1500)
    public void work(){
        mainDao.saveTheWorld();
    }

    @Scheduled(fixedDelay = 500)
    public void backup(){
        backupDao.saveTheWorld();
    }

}
