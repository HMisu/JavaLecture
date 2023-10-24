package chap06_method.calc;

public class Calculator {
	private int num;
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	// 1. public 메소드
	// 어디서나 접근 가능한 메소드
	public void add() {
		System.out.println(10 + 20);
	}

	// 2. protected 메소드
	// 같은 클래스, 같은 패키지 내의 클래스, 자식 클래스
	protected void sub() {
		System.out.println(20 - 10);
	}

	// 3. default 메소드
	// 같은 클래스, 같은 패키지 내 클래스
	void mul() {
		System.out.println(10 * 20);
	}

	// 4. private 메소드
	// 같은 클래스
	private void div() {
		System.out.println(20 / 10);
	}
}
