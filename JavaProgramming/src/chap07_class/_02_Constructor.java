package chap07_class;

import chap07_class.car.CarConstructor;

public class _02_Constructor {

	public static void main(String[] args) {
		CarConstructor car = new CarConstructor();
		System.out.println(car.company);

		CarConstructor car1 = new CarConstructor("현대", "제네시스", "검정", 5000000);
		car1.carInfo();
	}

}
