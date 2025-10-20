package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CalculatorTest {
    @Test
    void 기본_구분자로_계산() {
        Calculator calculator = new Calculator("1,2,3,4,5");
        assertThat(calculator.calculate()).isEqualTo(15);
    }

    @Test
    void 커스텀_구분자로_계산() {
        Calculator calculator = new Calculator("//;\\n1;2;3");
        assertThat(calculator.calculate()).isEqualTo(6);
    }

    @Test
    void 음수_입력시_예외() {
        Calculator calculator = new Calculator("1,-2");
        assertThatThrownBy(calculator::calculate)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수는 허용되지 않습니다");
    }
}
