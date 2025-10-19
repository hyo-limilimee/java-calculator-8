# java-calculator-precourse

## 기능 명세
- 입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현한다.
  - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달할 경우, 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
  - 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다.
  - 커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  - 사용자가 잘못된 값을 입력할 경우, `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.
---

## 구현할 기능 목록
### Application
- [X] 프로그램 시작점 (main 메서드)
- [X] CalculatorController를 생성하고 실행(run)한다.

### CalculatorController
- [X] InputView로부터 입력을 받는다.
- [X] Calculator에 입력을 전달해 결과를 받는다.
- [ ] OutputView를 통해 결과를 출력한다.

### InputView
- [X] 사용자로부터 문자열을 입력받는다.

### OutputView
- [ ] 계산 결과를 출력한다.
- [ ] 에러 메시지를 출력한다.

### Calculator
- [X] 문자열을 받아 Tokenizer를 통해 숫자 리스트로 변환한다.
- [X] 변환된 숫자들을 모두 합산하여 반환한다.
- [X] 숫자가 음수이거나 잘못된 값일 경우 `IllegalArgumentException`을 발생시킨다.

### Tokenizer
- [X] 입력 문자열을 분삭하여 숫자 토큰 리스트를 반환한다.
  - [X] 빈 문자열 입력 시 0 반환
  - [X] 기본 구분자(쉼표(,), 콜론(:)) 기준 분리
  - [X] 커스텀된 구준자 지정 여부 확인("//" 와 "\n" 사이 문자 추출)
  - [X] 분리된 문자열을 정수로 변환
  - [X] 숫자가 아닌 값이나 음수 입력시 `IllegalArgumentException`을 발생시킴

-----
## 프로젝트 파일 구조
java-calculator-8
┣ 📂 src
┃ ┣ 📂 main
┃ ┃ ┗ 📂 java
┃ ┃ ┃ ┗ 📂 calculator
┃ ┃ ┃ ┃ ┣ Application.java          
┃ ┃ ┃ ┃ ┣ CalculatorController.java 
┃ ┃ ┃ ┃ ┣ Calculator.java          
┃ ┃ ┃ ┃ ┣ Tokenizer.java       
┃ ┃ ┃ ┃ ┣ InputView.java    
┃ ┃ ┃ ┃ ┗ OutputView.java      
┃ ┗ 📂 test
┃ ┃ ┗ 📂 java
┃ ┃ ┃ ┗ 📂 calculator
┃ ┃ ┃ ┃ ┣ ApplicationTest.java  
┃ ┃ ┃ ┃ ┣ CalculatorControllerTest.java // Controller 단위 테스트
┃ ┃ ┃ ┃ ┣ CalculatorTest.java  
┃ ┃ ┃ ┃ ┣ TokenizerTest.java    
┃ ┃ ┃ ┃ ┣ InputViewTest.java   
┃ ┃ ┃ ┃ ┗ OutputViewTest.java 