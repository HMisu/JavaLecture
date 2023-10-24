package chap05_array;

public class _08_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정수 7개 저장할 수 있는 배열 만들고
		// 2. 1~45까지 숫자 중 랜덤 값 7개 저장(중복제거)
		// 3. 로또번호 출력 0~5의 인덱스는 실제 당첨 번호 6번 인덱스는 보너스 번호

		int[] arr = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			if (i == 0)
				continue;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					arr[i] = (int) (Math.random() * 45 + 1); // 다시 난수 생성
					break;
				}
			}

			/*
			 * 중복제거 if(i>0){ for(int j=0; j<i; j++) { if(arr[i] == arr[j]){ i--; break; } }
			 * }
			 */

		}

		System.out.println("이번주 로또 번호는");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if (i == arr.length - 1) {
				System.out.println("보너스 번호: " + arr[i]);
			}
		}

	}

}
