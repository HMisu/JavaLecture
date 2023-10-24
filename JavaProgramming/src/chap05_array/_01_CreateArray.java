package chap05_array;

public class _01_CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열의 선언
		// 자료형[] 변수명(배열명) = new 자료형[배열의 길이(저장할 값의 개수)];
		// 기본 자료형 또는 참조타입으로도 생성 가능
		
		int[] numArr = new int[5];
		
		// 2. 배열 초기화
		// {1, 2, , , }
		numArr[0] = 1;
		numArr[1] = 2;
		
		// 3. 배열 값의 사용
		// 각각의 인덱스로 접근해 사용
		// 변수명[인덱스]로 인덱스번째에 저장되어 있는 값 사용
		//System.out.println(numArr[0]);
		//System.out.println(numArr[1]);
		
		//초기화하지 않은 인덱스값 사용
		//System.out.println(numArr[2]);
		
		// 4. 길이가 큰 배열 생성
		int[] bigArr = new int[1000];
		
		for(int i=0; i<bigArr.length; i++) {
			bigArr[i] = i + 1;
		}
		
		for(int j=0; j<bigArr.length; j++) {
			if(bigArr[j]%3==0)
				System.out.println(bigArr[j]);
		}
		
		// 7. 배열의 선언과 동시에 초기화
		int[] intArr = {10, 20, 30, 40};
		
		// 8. 참조타입 배열 생성
		String[] strArr = new String[5];
		
		System.out.println(strArr[0]);
		
	}

}
