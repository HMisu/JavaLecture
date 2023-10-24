package date_231020.car;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void seppedUp() {
		System.out.println("속도를 높이다.");
	}

	@Override
	public void speedDown() {
		System.out.println("속도를 낮추다.");
	}

	@Override
	public void addFuel() {
		System.out.println("연료를 충전하다");
	}

	@Override
	public void charge() {
		System.out.println("전기를 충전하다.");
	}

}
