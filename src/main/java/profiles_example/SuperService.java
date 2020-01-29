package profiles_example;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */
public interface SuperService {
    @Scheduled(fixedDelay = 400)
    void doWork();
}
