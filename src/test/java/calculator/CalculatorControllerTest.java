package calculator;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CalculatorControllerTest {
    @Test
    void 정상_계산_흐름() {
        ByteArrayInputStream in = new ByteArrayInputStream("1,2,3\n".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        new CalculatorController().run();

        assertThat(out.toString()).contains("결과 : 6");
    }

    @Test
    void 음수_입력시_예외발생() {
        ByteArrayInputStream in = new ByteArrayInputStream("-1,2\n".getBytes());
        System.setIn(in);

        assertThatThrownBy(() -> new CalculatorController().run())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수는 허용되지 않습니다");
    }

}