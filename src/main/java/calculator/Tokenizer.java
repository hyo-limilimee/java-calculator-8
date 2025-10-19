package calculator;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    private final String input;

    public Tokenizer(String input) {
        this.input = input;
    }

    public List<Integer> tokenize() {
        List<Integer> numbers = new ArrayList<>();

        if (input == null || input.isEmpty()) {
            numbers.add(0);
            return numbers;
        }

        String delimiter = ",|:";

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\n");
            if (newlineIndex == -1) {
                throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
            }
            String customDelimiter = input.substring(2, newlineIndex);
            delimiter = customDelimiter;
            String body = input.substring(newlineIndex + 1);
            return parseTokens(body.split(delimiter));
        }

        return parseTokens(input.split(delimiter));
    }

    private List<Integer> parseTokens(String[] tokens) {
        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            try {
                numbers.add(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + token);
            }
        }
        return numbers;
    }
}
