package hello.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс простого сообщения, содержащего только имя пользователя
 *
 * @author Pavel Zaytsev
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleNameMessage {

    private String name;
}
