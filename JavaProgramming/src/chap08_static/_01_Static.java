package chap08_static;

public class _01_Static {

	public static void main(String[] args) {
		// 1. static 변수나 메소드 사용
		// class원형.변수명, 메소드명으로 사용
		Car.grade = "B";
		Car.getCurrentGrade();

		// 2. 인스턴스 변수나 메소드는 항상 객체를 생성해 사용
		Car car = new Car();
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.carInfo();

		// 3. 인스턴스 변수는 클래스 원형으로 접근할 수 없음
		/*Car.company = "기아";
		Car.carInfo();*/

	}

}
