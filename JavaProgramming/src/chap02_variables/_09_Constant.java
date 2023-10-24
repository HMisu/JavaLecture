package chap02_variables;

public class _09_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 상수 선언 및 초기화
		final int MAX_STUDENT_COUNT = 30;
		final int CURRENT_STUDENT_COUNT = 16;
		
		// 상수는 선언하고 나중에 초기화해도 무방
		final double PI;
		PI = 3.14;
		
		// 2. 상수에 값 한 번 저장되면 값 변경할 수 없음
		//PI=11.456; 에러
		
		// 3. 지정된 상수 이용한 연산
		int radius = 10;
		
		System.out.println("반지름이 10인 원의 둘레: "+(2*PI*radius));
		System.out.println("반지름이 20인 원의 둘레: "+(PI*20*20));
	}

}
