package chap09_inherit;

import chap09_inherit.car.Car;
import chap09_inherit.car.HyundaiCarInherit;
import chap09_inherit.car.KiaCarInherit;

public class _01_Inherit {

	public static void main(String[] args) {
		// 1. 상속받은
		HyundaiCarInherit hCar = new HyundaiCarInherit();

		hCar.company = "현대";
		hCar.model = "제네시스";
		hCar.color = "검정";
		hCar.price = 50000000;

		hCar.carInfo();

		// 3. 자식 클래스의 고유한 기능 사용 가능
		hCar.autoPilot();

		// 4.다형성의 기초
		// 자식클래스는 부모의 형태로도 사용할 수 있다.
		// 자식 타입의 객체를 부모타입의 변수에 담아서 사용할 수 있다.
		Car car = new HyundaiCarInherit();
		HyundaiCarInherit hCar2 = new HyundaiCarInherit();

		// 자식객체를 부모형태로 사용할 때는 자식의 고유 속성이나 기능 사용 못함
		// car.autoPilot(); 에러
		hCar2.autoPilot();

		// 부모형태의 변수에는 다른 자식 객체를 담을 수도 있음
		car = new KiaCarInherit();
	}

}
