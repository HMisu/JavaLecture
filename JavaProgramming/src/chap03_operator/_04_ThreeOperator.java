package chap03_operator;

public class _04_ThreeOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 삼항 조건연산자
		int num1 = 111, num2 = 10;
		
		// 111 / 10 > 0 => true
		int result = num1 / num2 > 0 ? num1 - 11 : num2 - 11;
		System.out.println(result);
	}

}
