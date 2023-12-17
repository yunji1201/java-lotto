## 요구사항
1. 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현
2. 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정
3. 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정
4. 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. (곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하는 것 무시)
   ex) 2 + 3 * 4 / 2 => 10

## 프로그래밍 요구사항
1. indent(들여쓰기) depth를 1단계로 줄여라.
2. 메소드의 크기가 최대 10라인을 넘지 않도록 구현 
   -> method가 한 가지 일만 하도록 최대한 작게 만들어라.
3. else를 사용 X

## TO-DO
- [X] 덧셈 기능 구현
- [X] 뺄셈 기능 구현
- [X] 곱셈 기능 구현
- [X] 나눗셈 기능 구현
- [X] 덧셋, 뺄셈, 곱셈, 나눗셈 통합 계산 기능 구현
- [X] 나눗셈 결과 값이 정수로 떨어지는지 확인
- [X] 아무런 데이터를 넣지 않았을 경우 IllegalArgumentException 발생
- [X] 사칙연산 기호가 아닌 경우 IllegalArgumentException 발생