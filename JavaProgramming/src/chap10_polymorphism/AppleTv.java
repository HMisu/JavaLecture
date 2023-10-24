package chap10_polymorphism;

import chap10_polymorphism.tv.Tv;

public class AppleTv extends Tv {
	public void testTv() {
		// public메소드는 어디서나 접근가능
		super.powerOff();

		// protected 메소드는 자식클래스는 사용 가능
		super.powerOff();

		// default 메소드는 같은 패키지 내에서만 사용 가능
		// super.operate(11); 에러

		// private 메소드는 접근 불가능
		// super.channelUp(); 에러
	}
}
