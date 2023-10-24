package chap04_controlstatement;

import java.util.Scanner;

public class _05_InfiniteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner: 사용자의 입력값을 받아주는 클래스
		// System.in: OS에서 사용하는 입력장치, 키보드
		Scanner sc = new Scanner(System.in);
		
		//정수형 입력받을 때는 Scanner.nextInt();
		//문자열 입력받을 때는 Scanner.next(), nextLine();
		while(true) {
			System.out.println("문자열을 입력하세요");
			String str = sc.nextLine();
			
			System.out.println("입력한 문자열은 "+str);
			
			if(str.equals("q"))
				break;
		}
		
		sc.close();
	}

}