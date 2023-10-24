package chap12_interface;

// 1. 인터페이스: 추상클래스보다 더 추상화 레벨이 높은 클래스
// 추상클래스가 멤버변수, 인스턴스 메소드, 추상 메소드를 가질 수 있었다면
// 인터페이스는 멤버변수는 static final만 가질 수 있고, 메소드는 추상메소드만 가질 수 있음
// 그냥 멤버변수를 선언해도 자동으로 public static final 키워드가 붙어 생성
// 메소드도 마찬가지로 그냥 메소드를 선언해도 public abstract 키워드가 붙어 생성
// 인터페이스에서 작성하는 메소드는 무조건 추상메소드이기 때문에 구현부({})을 가질 수 없음
// 인터페이스도 추상클래스와 마찬가지로 객체를 만들지 못해(인스턴스화 불가능) 자식클래스를 만들어야 함
public interface Board {
	// 2. 변수는 static final 상수로 만들어지기 때문에 초기화하지 않으면 에러 발생
	int boardNo = 10;

	// 3. 모든 메소드가 추상메소드이기 때문에 중괄호블록({})을 사용하면 에러 발생
	// public abstract를 생략해도 자동으로 붙어 추상메소드로 만들어짐
	void insertBoard();

	void deleteBoard();

	void pdateBoard();

	void selectBoard();

	// 4. 부모 인터페이스에 새로운 기능 추가하려면 모든 자식클래스를 수정해야하는 문제점이 발생해 default 메소드 등장
	// default 메소드는 오버라이딩 가능해 필요한 클래스에서만 재정의 할 수 있다.
	// default 메소드는 접근 제어자 생략하면 자동으로 public으로 지정됨
	// void selectBoardList();
	default void selectBoardList() {
		System.out.println("게시글 목록 조회");
	}

}
