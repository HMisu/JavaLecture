package date_231020;

import java.util.Scanner;

public class ChangingCharByIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요");
		String s = sc.nextLine();
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (i != 0 && i % 3 == 0) {
				result = result + 3;
			} else if (i != 0 && i % 5 == 0) {
				result = result + 5;
			} else {
				result = result + s.charAt(i);
			}
		}

		System.out.println(result);
	}

}
