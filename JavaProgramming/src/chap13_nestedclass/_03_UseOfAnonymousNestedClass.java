package chap13_nestedclass;

public class _03_UseOfAnonymousNestedClass {

	public static void main(String[] args) {
		// 1. 익명 중첩 클래스
		// 익명 중첩 클래스는 추상 클래스나 인터페이스를 상속받은 자식 클래스 없이도 인스턴스를 생성해 사용할 수 있게 해줌
		// 생성자에서 추상메소드를 구현함. 인터페이스 내에 있는 추상메소드 모두 Override해야 함.
		AnonymousNestedClass anc = new AnonymousNestedClass() {
			@Override
			public void calculate(int a, int b) {
				System.out.println(a + b);
			}

			@Override
			public void mul(int a, int b) {
				System.out.println(a * b);
			}
		};
		anc.calculate(10, 20);
	}

}
