package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1~10 거꾸로 출력
		int i = 10;
		
		while(i>=1) {
			System.out.println(i--);
		}
		
		System.out.println("--------------------------");
		
		// 2. 1~100 4,6의 공배수 출력
		int j = 1;
		
		while(j<=100) {
			if(j%4==0&&j%6==0) {
				System.out.println(j);
			}
			j++;
		}
	}

}
