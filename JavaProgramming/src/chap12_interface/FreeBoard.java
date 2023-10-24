package chap12_interface;

public class FreeBoard implements Board {
	String attachFile;

	public FreeBoard() {

	}

	public FreeBoard(int boardNo, String boradTitle, String boardContent, String boardWriter, String boardDate,
			String attachFile) {
		// super(boardNo, boradTitle, boardContent, boardWriter, boardDate);
		this.attachFile = attachFile;
	}

	public void upload(String attachFile) {
		this.attachFile = attachFile;
		System.out.println(attachFile + "파일을 업로드합니다.");
	}

	@Override
	public void insertBoard() {
		System.out.println("자유 게시판 게시글을 작성합니다.");
	}

	@Override
	public void deleteBoard() {
	}

	@Override
	public void pdateBoard() {
	}

	@Override
	public void selectBoard() {
	}

	// 2. default 메소드의 오버라이드
	@Override
	public void selectBoardList() {
		System.out.print("자유게시판 ");
		// 3. 인터페이스의 default 메소드는 인터페이스명.super 키워드로 호출 가능함
		Board.super.selectBoardList();
	}
}
