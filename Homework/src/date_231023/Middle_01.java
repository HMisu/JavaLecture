package date_231023;

import java.util.Scanner;

public class Middle_01 {
	// 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요.
	// 문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요.");
		String s = sc.nextLine();

		if (s.length() % 2 == 0) {
			System.out
					.println(String.valueOf(s.charAt((s.length() / 2) - 1)) + String.valueOf(s.charAt(s.length() / 2)));
		} else {
			System.out.println(s.charAt(s.length() / 2));
		}

		sc.close();
	}

}
