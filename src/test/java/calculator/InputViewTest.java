package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest extends NsTest {

    @Test
    void 입력을_읽는다() {
        assertSimpleTest(() -> {
            run("123");
            assertThat(output()).contains("덧셈할 문자열을 입력해 주세요.");
        });
    }

    @Test
    void 빈문자열_입력() {
        assertSimpleTest(() -> {
            run("\n");
            assertThat(output()).contains("덧셈할 문자열을 입력해 주세요.");
        });
    }

    @Override
    public void runMain() {
        new InputView().readInput();
    }
}
