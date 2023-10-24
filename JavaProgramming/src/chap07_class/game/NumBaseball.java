package chap07_class.game;

import java.util.Scanner;

public class NumBaseball {
	// 1. 컴퓨터가 0~9까지의 랜덤값을 3개 배열에 저장(중복불가능) 0, 1, 2 ~9, 8, 7
	// 2. 사용자가 0~9 세번 입력해 배열에 저장(중복불가능)
	// 3. 사용자가 입력한 숫자 중 컴퓨터의 랜덤값과 같은 숫자면서 위치가 다르면 볼
	// 4. 사용자가 입력한 숫자 중 컴퓨터의 랜덤값과 같은 숫자면서 위치가 같으면 스트라이크
	// 3스트라이크 될 때까지 사용자가 3회씩 입력할 수 있도록

	// 변수 선언
	int strike = 0, ball = 0;
	int[] com = new int[3];
	int[] user = new int[3];

	Scanner sc = new Scanner(System.in);

	public void start() {
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 10);

			if (i == 0)
				continue;

			if (isDuplicated(com, i) == true) {
				i--;
				continue;
			}
		}

		strike = 0;
		ball = 0;

		while (true) {
			for (int i : com) {
				System.out.print(i + " ");
			}
			System.out.println();

			for (int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();

				if (i == 0)
					continue;

				if (isDuplicated(user, i) == true) {
					i--;
					continue;
				}
			}

			for (int i : user) {
				System.out.print(i + " ");
			}
			System.out.println();

			judgeStrike(com, user);

			if (strike == 3) {
				System.out.println("3스트라이크 아웃. 게임을 종료합니다.");
				break;
			} else {
				System.out.println(strike + "스트라이크, " + ball + "볼");
			}
		}
	}

	public boolean isDuplicated(int[] arr, int index) {
		for (int j = 0; j < index; j++) {
			if (arr[j] == arr[index]) {
				return true;
			}
		}
		return false;
	}

	public void judgeStrike(int[] com, int[] user) {
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[i]) {
					if (i == j)
						strike++;
					else
						ball++;
				}
			}
		}
	}
}
