package chap09_inherit.calc;

//Calculator를 상속받은 Add, Sub, Mul, Div 클래스 만들고 overrding;
public abstract class Calculator {
	int a;
	int b;

	public Calculator() {

	}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/*	public int calculate() {
			return 0;
		}*/

	// 다형성을 구현하면 부모의 메소드는 실행이 안되기 때문에 추상화함
	public abstract int calculate();
}
