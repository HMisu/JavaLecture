package date_231019;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	static int med3(int a, int b, int c) {
		int middle = a;
		// if a가 b보다 크고
		if (a >= b) {
			if (b > c) // b가 c보다 작음
				middle = b;
			else if (a < c) // a가 b보다 크고 c보다 작음
				middle = c;
			else // a가 b보다 크고 c보다도 큼
				middle = a;
		} else if (c <= a)
			return a;
		else if (b >= c)
			return c;
		else
			return b;

		return middle;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");
		int a = stdIn.nextInt();
		System.out.print("b의 값：");
		int b = stdIn.nextInt();
		System.out.print("c의 값：");
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}
