package calculator;

import java.util.Scanner;

public class CalculatorController {
    public void run() {
        InputView inputView = new InputView(new Scanner(System.in));
        String input = inputView.readInput();

        Calculator calculator = new Calculator(input);
        int result = calculator.calculate();

        OutputView outputView = new OutputView();
        outputView.printResult(result);
    }
}
