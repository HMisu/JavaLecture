package chap05_array;

public class _06_ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		// 1. 얕은 복사
		int[] copyArr = arr;
		
		// 배열명 출력하면 참조형 변수라 주소값이 추력됨
		System.out.println(arr);
		System.out.println(arr);
		System.out.println(arr==copyArr);
		
		// 얕은 복사는 같은 메모리 공유
		// intArr2의 값 바꾸면 intArr1도 변경됨(서로 영향끼침)
		arr[0]=100;
		copyArr[4]=1000;
		
		System.out.println(copyArr[0]);
		System.out.println(arr[4]);
	}

}
