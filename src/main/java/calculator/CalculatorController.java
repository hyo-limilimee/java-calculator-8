package calculator;

import java.util.Scanner;

public class CalculatorController {
    public void run() {
        try {
            InputView inputView = new InputView(new Scanner(System.in));
            String input = inputView.readInput();

            Calculator calculator = new Calculator(input);
            int result = calculator.calculate();

            OutputView outputView = new OutputView();
            outputView.printResult(result);

        } catch (IllegalArgumentException e) {
            new OutputView().printError(e.getMessage());
        }
    }
}
