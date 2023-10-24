package date_231023;

import java.util.Scanner;

public class Basic_02 {
	// 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
	// 대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u

	public static void main(String[] args) {
		String[] abc = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요.");
		String result = sc.nextLine();

		for (String s : abc) {
			result = result.replace(s, ""); // replace(변환하고자 하는 문자, 변화할 문자)
		}
		/*
		 for(int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) != 'a' || str2.charAt(i) != 'A'
				|| str2.charAt(i) != 'e' || str2.charAt(i) != 'E'
				|| str2.charAt(i) != 'i' || str2.charAt(i) != 'I'
				|| str2.charAt(i) != 'o' || str2.charAt(i) != 'O'
				|| str2.charAt(i) != 'u' || str2.charAt(i) != 'U') {
					str3 += str2.charAt(i);
				}
		}
		 */

		System.out.println(result);
		sc.close();
	}
}
