package calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InputViewTest {
    @Test
    void 입력을_읽는다() {
        ByteArrayInputStream in = new ByteArrayInputStream("123\n".getBytes());
        InputView inputView = new InputView(new Scanner(in));
        assertThat(inputView.readInput()).isEqualTo("123");
    }

    @Test
    void 빈문자열_입력() {
        ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
        InputView inputView = new InputView(new Scanner(in));
        assertThat(inputView.readInput()).isEqualTo("");
    }
}