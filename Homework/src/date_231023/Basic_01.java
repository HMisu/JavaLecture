package date_231023;

import java.util.Scanner;

public class Basic_01 {
	// 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
	// 0개면 '가, 바가 존재하지 않습니다.'라고 출력.

	public static void main(String[] args) {
		int gaCnt = 0, baCnt = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요.");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '가')
				gaCnt++;
			if (s.charAt(i) == '바')
				baCnt++;
		}

		System.out.println("문자열에서 가의 개수는 " + gaCnt + ", 바의 개수는 " + baCnt + "입니다.");
		sc.close();
	}
}
