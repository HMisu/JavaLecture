package chap09_inherit.animal;

public class Animal {
	int age;
	String size;
	int legCnt;
	boolean hasWing;

	public Animal() {

	}

	public Animal(int age, String size, int legCnt, boolean haswWing) {
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = haswWing;
	}

	public void eat() {
		System.out.println("먹이를 먹는다.");
	}

	public void sleep() {
		System.out.println("잠을 잔다.");
	}

	public int getAge() {
		return this.age;
	}
}