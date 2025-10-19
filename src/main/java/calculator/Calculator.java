package calculator;

import java.util.List;

public class Calculator {
    private final String input;
    private final Tokenizer tokenizer;

    public Calculator(String input) {
        this.input = input;
        this.tokenizer = new Tokenizer(input);
    }

    public int calculate() {
        List<Integer> numbers = tokenizer.tokenize();

        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + num);
            }
            sum += num;
        }
        return sum;
    }
}
