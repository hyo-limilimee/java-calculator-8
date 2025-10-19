package calculator;

public class OutputView {
    public void printResult(int result) {
        System.out.println("결과 : " + result);
    }

    public void printError(String message) {
        System.out.println("에러 발생: " + message);
    }
}