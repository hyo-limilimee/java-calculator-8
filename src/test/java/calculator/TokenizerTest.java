package calculator;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class TokenizerTest {
    @Test
    void 기본_구분자로_숫자_분리() {
        Tokenizer tokenizer = new Tokenizer("1,2:3");
        List<Integer> tokens = tokenizer.tokenize();
        assertThat(tokens).containsExactly(1, 2, 3);
    }

    @Test
    void 커스텀_구분자로_숫자_분리() {
        Tokenizer tokenizer = new Tokenizer("//!@#\\n1!@#2!@#3");
        List<Integer> tokens = tokenizer.tokenize();
        assertThat(tokens).containsExactly(1, 2, 3);
    }

    @Test
    void 숫자가_아닌값_예외() {
        Tokenizer tokenizer = new Tokenizer("1,A,3");
        assertThatThrownBy(tokenizer::tokenize)
                .isInstanceOf(IllegalArgumentException.class);
    }
}