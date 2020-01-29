package profiles_example;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("NESS")
public class NessSuperService implements SuperService {

    @Override
    @Scheduled(fixedDelay = 400)
    public void doWork(){
        System.out.println("NESSSSSSSSSSSSSSSSSS");
    }
}
