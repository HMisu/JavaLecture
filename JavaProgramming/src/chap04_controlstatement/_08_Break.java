package chap04_controlstatement;

import java.util.Scanner;

public class _08_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 0을 입력하기 전까지 입력하는 모든 수를 합한 값 출력
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요. 0은 종료");
			int userNum = sc.nextInt();
			
			if(userNum == 0)
				break;
			
			sum+=userNum;
		}
		
		System.out.println("지금까지 입력한 수의 합은: "+sum);
		sc.close();
	}

}
