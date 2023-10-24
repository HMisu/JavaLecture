package chap12_interface.device;

// 일반 class 상속과 인터페이스 상속 둘다 한번에 가능
public class LgTv extends ElectronicDevice implements Tv {

	@Override
	public void show() {
	}

	@Override
	public void sound() {
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("LgTv" + channel + "로 채널을 변경한다.");
	}

}
