package chap04_controlstatement;

public class _03_ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100까지의 합 : "+sum);
		System.out.println("마지막 i의 값 : "+i);
		
		// 2. 1~100의 정수 중 2와 5의 공배수
		for(int j=1; j<=100; j++) {
			if(j%2 == 0 && j%5 == 0) 
				System.out.println(j);
		}
		
		for(int k=100; k>=1; k--)
			System.out.println(k);
	} 

}
