package chap05_array;

public class _02_ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 10개 정수형 배열 생성하고 
		int[] numArr = new int[10];
		
		int i=0;
		int index=0;
		while(index < numArr.length) {
			i++;
			if(i%3==0) {
				numArr[index]=i;
				index++;
			}
		}
		
		for(int j=0; j<numArr.length; j++) {
			System.out.println(numArr[j]);
		}
		

	}

}
