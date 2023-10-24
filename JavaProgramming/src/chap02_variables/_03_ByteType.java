package chap02_variables;

public class _03_ByteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. byte 타입의 변수 선언 및 초기화
		byte num1 = -128;
		byte num2 = 127;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 2. 범위를 초과하는 값을 저장하면 에러 발생
		// byte num3 = -129; 에러
		// byte num4 = 128; 에러
		num1--; // 1000 0000 -1 -> 0111 1111 (127) 비트연산
		// num2++;
	}

}
