package chap05_array;

import java.util.*;

public class _04_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Random 값 생성하는 방법
		// Random 클래스 사용
		Random random = new Random();
		//random.nextInt(3) => 0, 1, 2 중 랜덤값
		int randomValue = random.nextInt(3);
		System.out.println(randomValue);
		
		//random.nextInt(3) => 1, 2,3 중 랜덤값
		randomValue = random.nextInt(3)+1;
		System.out.println(randomValue);
		
		//1~100가지 랜덤값
		randomValue = random.nextInt(100)+1;
		System.out.println(randomValue);
		
		// 2. Random 값 생성하는 방법2
		// Math 클래스의 Random() 메소드 사용
		// 0<=Math.random()<1 의 실수를 랜덤으로 선택
		// (int)0<=(int)Math.random()<(int)1 -> 소수점 나머지 버려서 의미 없음
		// 0*10<= Math.random*10<1*10 
		// (int)0<=(int)(Math.random*10)<(int)10 0~9
		// 1~45까지의 랜덤값 생성
		randomValue = (int)(Math.random()*45)+1;
		
		//3.정수 10개를 갖는 배열 생성하고 1~10까지 랜덤값 저장
		int[] intArr = new int[10];
		
		for(int i=0; i<intArr.length;i++) {
			intArr[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<intArr.length;i++) {
			System.out.println("intArr["+i+"]: "+intArr[i]);
		}
	}

}
