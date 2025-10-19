package calculator;

import java.util.Scanner;

public class InputView {
    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public String readInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return sc.nextLine();
    }
}
