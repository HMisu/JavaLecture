package chap04_controlstatement;

import java.util.Scanner;

public class _09_BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요. 0은 종료");
			int num = sc.nextInt();
			if(num==0)
				break;
				
				for(int i=2; i<=num; i++) {
					System.out.println(i+"단");
					for(int j=1; j<=9; j++) {
						System.out.print(i+"*"+j+"="+i*j+" ");
					}
					System.out.println("");
				}
				System.out.println("");
		}

		sc.close();

	}

}
