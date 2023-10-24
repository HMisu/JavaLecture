package date_231017;

import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1~99사이의 정수를 입력해주세요.");

			int num = sc.nextInt();
		
			if(num<1||num>99) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			int a = num/10; //10의 자리수
			int b = num%10; //1의 자리수
			int cnt = 0;
			
			//1의 자리인 경우
			if(num>10) {
				if(b%3==0)
					cnt++;
			} else {
				if(a%3==0)
					cnt++;
				if(b%3==0)
					cnt++;			
			}
			
			switch(cnt) {
				case 0:
					System.out.println("박수없음");
					break;
				case 1:
					System.out.println("박수짝");
					break;
				case 2:
					System.out.println("박수짝짝");
					break;
			}
			
			break;
			
		}
		
		sc.close();
	}
}
