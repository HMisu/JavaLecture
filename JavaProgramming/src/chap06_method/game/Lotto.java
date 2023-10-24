package chap06_method.game;

public class Lotto {
	// 1. 1~45까지 숫자 중 랜덤 값 7개를 저장하는 배열을 리턴하는 메소드를 만드세요 (중복제거)

	public int[] generateRandomArr() {
		int arr[] = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			if (i == 0)
				continue;

			if (isDuplicated(arr, i) == true) {
				i--;
				// System.out.print(chechk(arr, i));
				continue;
			}
		}

		return arr;
	}

	public boolean isDuplicated(int[] arr, int index) {
		for (int j = 0; j < index; j++) {
			if (arr[j] == arr[index]) {
				return true;
			}
		}
		return false;
	}
}
