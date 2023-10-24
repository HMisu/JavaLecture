package chap11_abstraction.tv;

public abstract class Tv {
	public int lastChannel;

	// 추상클래스의 생성자는 자식클래스에서 사용가능하다.
	// new 연산자로 직접 생성자를 호출할 수는 없지만 자식 객체가 생성될 때 super(…)를
	// 호출해서 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 합니다.
	public Tv() {
		lastChannel = 1;
	}

	public Tv(int lastChannel) {
		this.lastChannel = lastChannel;
	}

	// 추상메소드 선언
	public abstract void powerOn();

	public abstract void powerOff();

	public abstract void operate(int channel);

	public abstract void moveTo(int channel);

	public void channelUp() {
		this.lastChannel++;
	}

	public void channelDown() {
		this.lastChannel--;
	}
}
