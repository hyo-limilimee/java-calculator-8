package calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {
    @Test
    void 입력을_읽는다() {
        System.setIn(new ByteArrayInputStream("123\n".getBytes()));
        InputView inputView = new InputView();
        assertThat(inputView.readInput()).isEqualTo("123");
    }

    @Test
    void 빈문자열_입력() {
        System.setIn(new ByteArrayInputStream("\n".getBytes()));
        InputView inputView = new InputView();
        assertThat(inputView.readInput()).isEqualTo("");
    }
}
