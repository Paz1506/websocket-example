package hello.api;

import hello.model.Greeting;
import hello.model.HelloMessage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GreetingControllerTest {

    private final GreetingController controller = new GreetingController();

    private final String name = "name";

    @Test
    void greeting() throws Exception {
        // Prepare
        HelloMessage helloMessage = new HelloMessage(name);
        String expectedContent = "Hello, " + name + "!";

        // Actual
        Greeting actualResult = controller.greeting(helloMessage);

        //  Assertion
        Assertions.assertThat(actualResult.getContent()).isEqualTo(expectedContent);
    }
}