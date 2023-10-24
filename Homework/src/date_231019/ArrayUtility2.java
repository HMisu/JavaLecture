package date_231019;

public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		// s1과 s2를 연결한 새로운 배열 리턴
		int[] iArr = new int[s1.length + s2.length];

		for (int i = 0; i < iArr.length; i++) {
			if (i < s1.length) {
				iArr[i] = s1[i];
			} else {
				iArr[i] = s2[i - s1.length];
			}
		}

		return iArr;
	}

	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	static int[] remove(int[] s1, int[] s2) {
		int[] iArr = new int[s1.length - s2.length + 1];
		int cnt = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					iArr[cnt] = s1[i];
					cnt++;
					break;
				}
			}
		}
		return iArr;
	}

	public static void main(String[] args) {
		int[] s1 = { 1, 2, 3, 4, 5 };
		int[] s2 = { 1, 4, 3 };

		int[] result1 = concat(s1, s2);
		System.out.println("배열 연결");
		for (int i : result1) {
			System.out.println(i + " ");
		}
		System.out.println();
		int[] result2 = remove(s1, s2);
		System.out.println("s1에서 s2의 배열의 숫자 삭제");
		for (int i : result2) {
			System.out.println(i + " ");
		}
	}

}
