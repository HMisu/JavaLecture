package chap05_array;

public class _07_DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		// 1. 깊은 복사 arr.clone() 이용
		int[] copyArr = arr.clone();
		
		System.out.println(arr);
		System.out.println(copyArr);
		System.out.println(arr==copyArr);
		
		arr[0]=20;
		System.out.println(copyArr[0]);
		
		System.out.println("-------------");
		
		// 2. 깊은복사 System.arraycopy() 이용
		int[] copyArr2 = new int[5];
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		for(int i:copyArr2) {
			System.out.println(i);
		}
	}

}