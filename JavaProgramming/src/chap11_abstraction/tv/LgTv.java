package chap11_abstraction.tv;

public class LgTv extends Tv {
	public LgTv() {
		super();
	}

	public LgTv(int lastChannel) {
		super(lastChannel);
	}

	@Override
	public void powerOn() {
		System.out.println("제조사: LG");
		System.out.println("TV의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("제조사: LG");
		System.out.println("TV의 전원을 끕니다.");
	}

	@Override
	public void operate(int channel) {
		lastChannel = channel;
		moveTo(channel);
	}

	@Override
	public void moveTo(int channel) {
		System.out.println(channel + "로 이동합니다.");
	}

	@Override
	public void channelUp() {
		super.channelUp();
		System.out.println("채널 번호 감소");
	}

	@Override
	public void channelDown() {
		super.channelDown();
		System.out.println("채널 번호 증가");
	}

}
