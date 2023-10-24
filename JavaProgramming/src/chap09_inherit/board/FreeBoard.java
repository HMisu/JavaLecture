package chap09_inherit.board;

public class FreeBoard extends Board {
	String attachFile;

	public FreeBoard() {

	}

	public FreeBoard(int boardNo, String boradTitle, String boardContent, String boardWriter, String boardDate,
			String attachFile) {
		super(boardNo, boradTitle, boardContent, boardWriter, boardDate);
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
}
