package date_231023;

import java.util.Scanner;

public class Basic_03 {
	// 사용자가 입력한 문자열1, 문자열2 문자열1이 문자열2를 포함하면
	// '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열1을 입력하세요.");
		String s1 = sc.nextLine();
		System.out.println("문자열2를 입력하세요.");
		String s2 = sc.nextLine();

		if (s1.contains(s2))
			System.out.println("포함합니다.");
		else
			System.out.println("포함하지 않습니다.");

		sc.close();

	}
}
