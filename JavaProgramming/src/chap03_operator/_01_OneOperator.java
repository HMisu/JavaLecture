package chap03_operator;

public class _01_OneOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 부호연산자
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		
		System.out.println("---------------------");

		// 2. 증감연산자
		// 2-1. 전위 증감연산자
		int num2 = 20;
		
		if(++num2 > 20) {
			System.out.println("num2는 20보다 큽니다.");
		}
		
		
		//num2 = num2-1;
		System.out.println(--num2);
		
		// 3. 후위 증감연산자
		int num3 = 20;
		
		if(num3++>20) {
			System.out.println("num3는 20보다 큽니다");
		}
		
		System.out.println(num3--);
		System.out.println(num3);
		
		System.out.println("---------------------");
	}

}
