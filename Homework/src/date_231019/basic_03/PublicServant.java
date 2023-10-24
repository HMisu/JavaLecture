package date_231019.basic_03;

public class PublicServant extends Worker {
	public PublicServant() {

	}

	@Override
	public void goToWork() {
		System.out.println("공무원이 출근하다.");
	}

	@Override
	public void getOffWork() {
		System.out.println("공무원이 퇴근하다.");
	}

	@Override
	public void work() {
		System.out.println("공무직을 수행한다.");
	}
}
