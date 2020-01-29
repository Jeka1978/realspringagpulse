package quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Film
public class TerminatorQuoter implements Quoter {


    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] line) {
        this.messages = asList(line);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
