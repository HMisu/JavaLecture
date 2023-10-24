package chap06_method.calc;

public class CompleteCalculator {

	// TODO Auto-generated method stub
	// int형 매개변수 두개를 받는 메소드 add(덧셈), sub(뺄셈), mul(곱셈), div(나눗셈), mod(나머지)
	// div만 리턴타입을 double로!
	// 나눗셈과 나머지 분모에 0이 들어오면 0 리턴

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public double div(int num1, int num2) {
		return (num2 == 0) ? 0 : (double) num1 / (double) num2;
	}

	public int mod(int num1, int num2) {
		return (num2 == 0) ? 0 : num1 % num2;
	}
}
