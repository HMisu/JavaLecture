package date_231019.basic_03;

public class Developer extends Worker {
	public Developer() {

	}

	@Override
	public void goToWork() {
		System.out.println("개발자가 출근하다.");
	}

	@Override
	public void getOffWork() {
		System.out.println("개발자가 퇴근하다.");
	}

	@Override
	public void work() {
		System.out.println("개발한다.");
	}
}
