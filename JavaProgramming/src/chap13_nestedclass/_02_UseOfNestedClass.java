package chap13_nestedclass;

public class _02_UseOfNestedClass {

	public static void main(String[] args) {
		// 1. 지역 중첩 클래스는 따로 객체 생성이 불가능함
		LocalNestedClass lnc = new LocalNestedClass();
		lnc.speedUp();

		// LocalNestedClass.Engine eg = new Engine(); 에러
		// Engine eg = new Engine(); 에러, 사용 불가능
	}

}
