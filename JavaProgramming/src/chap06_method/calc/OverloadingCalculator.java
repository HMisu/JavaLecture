package chap06_method.calc;

public class OverloadingCalculator {

	public int add(int a, int b) {
		return a + b;
	}

	// 오버로딩된 메소드: 매개변수의 타입, 개수, 순서를 변경해 메소드 선언
	public int add(double a, int b) {
		return (int) a + b;
	}

	public int add(int a, double b) {
		return a + (int) b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a) {
		return a + a;
	}

	// 첫번째 add메소드와 매개변수 타입, 개수, 순서 모두 동일해 같은 메소드로 인식해 선언 불가능
	/*public int add(int c, int d) {
		return c+d;
	}*/
}
