package hello.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Pavel Zaytsev
 */
@Getter
@AllArgsConstructor
public class SimpleNameGreeting implements Greeting {

    private String content;
}
