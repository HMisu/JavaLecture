package chap06_method;

import chap06_method.calc.CompleteCalculator;

public class _05_UserOfCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteCalculator cal = new CompleteCalculator();

		int result;
		double dResult;

		int num1 = 115;
		int num2 = 27;

		result = cal.add(num1, num2);
		System.out.println("num1 + num2 = " + result);

		result = cal.sub(num1, num2);
		System.out.println("num1 - num2 = " + result);

		result = cal.mul(num1, num2);
		System.out.println("num1 * num2 = " + result);

		dResult = cal.div(num1, num2);
		System.out.println("num1 / num2 = " + dResult);

		result = cal.mod(num1, num2);
		System.out.println("num1 % num2 = " + result);

	}

}
