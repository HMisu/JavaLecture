package date_231017;

import java.util.Scanner;

public class Basic_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
			sum+=arr[i];
		}
		System.out.println("총합: "+sum);
	}

}
