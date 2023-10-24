package chap06_method;

import chap06_method.calc.OverloadingCalculator;

public class _04_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20, num3 = 30;
		double dNum = 30.0;

		int result;

		OverloadingCalculator ocalc = new OverloadingCalculator();

		result = ocalc.add(num1);
		System.out.println(result);

		result = ocalc.add(dNum, num1);
		System.out.println(result);

		result = ocalc.add(num1, num2, num3);
		System.out.println(result);
	}

}
