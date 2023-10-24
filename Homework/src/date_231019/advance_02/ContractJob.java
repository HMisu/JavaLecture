package date_231019.advance_02;

public class ContractJob extends Employee {
	private int workDay;

	public ContractJob(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay() * this.workDay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무일수 : " + this.workDay);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
