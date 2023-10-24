package date_231023;

public class Middle_02 {
	// 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l',
	// 't'}로 초기화합니다.
	// 단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)

	public static void main(String[] args) {
		char[] chArr = { 'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't' };

		String[] strArr = { "", "", "", "" };

		for (int i = 0; i < chArr.length; i++) {
			if (i % 4 == 0) {
				strArr[0] += chArr[i];
			} else if (i % 4 == 1) {
				strArr[1] += chArr[i];
			} else if (i % 4 == 2) {
				strArr[2] += chArr[i];
			} else if (i % 4 == 3) {
				strArr[3] += chArr[i];
			}
		}

		for (String s : strArr) {
			System.out.println(s);
		}
	}

}
