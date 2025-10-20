package calculator;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OutputViewTest {
    @Test
    void 결과_출력() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new OutputView().printResult(5);
        assertThat(out.toString()).contains("결과 : 5");
    }

    @Test
    void 에러_출력() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new OutputView().printError("테스트 에러");
        assertThat(out.toString()).contains("에러 발생: 테스트 에러");
    }
}
