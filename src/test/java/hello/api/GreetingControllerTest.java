package hello.api;

import hello.model.Greeting;
import hello.model.SimpleNameMessage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GreetingControllerTest {

    private final GreetingController controller = new GreetingController();

    private final String name = "name";

    @Test
    void greeting() throws InterruptedException {
        // Prepare
        SimpleNameMessage message = new SimpleNameMessage(name);
        String expectedContent = "Hello, " + name;

        // Actual
        Greeting actualResult = controller.greeting(message);

        //  Assertion
        Assertions.assertThat(actualResult.getContent()).isEqualTo(expectedContent);
    }
}