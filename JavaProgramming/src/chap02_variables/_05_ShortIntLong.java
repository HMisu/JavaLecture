package chap02_variables;

public class _05_ShortIntLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. short 타입 변수 선언 및 초기화
		short sNum1 = 10;
		short sNum2 = 20;
		
		// 2. int 타입 변수 선언 및 초기화
		int iNum1 = 200;
		int iNum2 = 200000000;
		
		// 3. long 타입의 변수 선언 및 초기화
		// L이나 l 붙이는 것에 차이 없음
		// int의 값을 초과하지 않은 값에는 L이나 l 붙이지 않아도 에러 발생 안함
		long lNum1 = 100L;
		long lNum2 = 100l;
		long lNum3 = 100;
		
		// int의 값을 초과하는 버무이 값을 지정할 때는 무조건 L이나 l 붙여야 함
		long lNum4 = 5000000000L;
		
		// 4. 모든 타입은 범위를 초과하는 값을 저장하면 에러 발생
		//short sNum3 = 32768; 에러
		
	}

}
