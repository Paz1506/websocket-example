package hello.api;

import hello.model.Greeting;
import hello.model.SimpleNameGreeting;
import hello.model.SimpleNameMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author Pavel Zaytsev
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(SimpleNameMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new SimpleNameGreeting("Hello, " + message.getName());
    }
}
