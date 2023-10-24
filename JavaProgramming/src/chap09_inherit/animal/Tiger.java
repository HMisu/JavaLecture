package chap09_inherit.animal;

public class Tiger extends Animal {
	String color;

	public Tiger() {

	}

	// 상속 받아서 부모 클래스에 있는 속성 바로 사용 가능.
	public Tiger(int age, String size, int legCnt, boolean hasWing) {
		/*this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;*/
		super(age, size, legCnt, hasWing); // 위와 같은 의미. 부모의 생성자 호출.
		this.color = color;
	}

	// 1.오버라이딩
	// 부모 클래스에 선언되어 있는 메소드를 자식 클래스에서 재정의해 새로운 기능으로 사용할 수 있음
	// 부모 클래스에 선언되어 있는 메소드와 완전 동일한 형태로 만듦
	public void eat() {
		System.out.println("육식을 한다.");
	}

	public void sleep() {
		System.out.println("누워서 잔다.");
	}

	public int getAge() {
		return this.age * 3;
	}
}
