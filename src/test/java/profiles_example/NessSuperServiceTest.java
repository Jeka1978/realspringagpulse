package profiles_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Main.class)
@ActiveProfiles("NESS")
public class NessSuperServiceTest {

    @Autowired
    NessSuperService nessSuperService;

    @Test
    public void doWork() {
        nessSuperService.doWork();
    }
}