package date_231019.basic_01;

public class Felidae extends Mammal {
	int name;
	String kingdom;
	int divison;

	public Felidae() {

	}

	public Felidae(int name, String kingdom, int divison, String life) {
		this.name = name;
		this.kingdom = kingdom;
		this.divison = divison;
	}

	@Override
	public void eat() {
		System.out.println("육식을 한다.");
	}

	@Override
	public void sleep() {
		System.out.println("잠을 잔다.");
	}

	public void life() {
		System.out.println("생활을 한다.");
	}

	public void water() {
		System.out.println("물에 들어간다.");
	}

}
