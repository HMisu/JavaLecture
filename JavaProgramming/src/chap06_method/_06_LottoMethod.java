package chap06_method;

import chap06_method.game.Lotto;

public class _06_LottoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		int[] arr = lotto.generateRandomArr();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
