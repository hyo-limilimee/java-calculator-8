package calculator;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    private final String input;

    public Tokenizer(String input) {
        this.input = input;
    }

    public List<Integer> tokenize() {
        if (input == null || input.isEmpty()) {
            return List.of(0);
        }

        String delimiter = ",|:";
        String numbers = input;

        if (input.startsWith("//")) {
            String[] parts = input.substring(2).split("\\\\n");

            delimiter = parts[0];
            numbers = parts[1];
        }

        return parseTokens(numbers.split(delimiter));
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
