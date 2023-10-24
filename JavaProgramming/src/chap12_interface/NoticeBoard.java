package chap12_interface;

public class NoticeBoard implements Board {
	boolean isAdmin;

	public NoticeBoard() {

	}

	public NoticeBoard(int boardNo, String boradTitle, String boardContent, String boardWriter, String boardDate,
			boolean isAdmin) {
		// super(boardNo, boradTitle, boardContent, boardWriter, boardDate);
		this.isAdmin = isAdmin;
	}

	@Override
	public void insertBoard() {
		if (this.isAdmin) {
			System.out.println("관리자가 공지사항을 등록합니다.");
		} else {
			System.out.println("공지사항은 관리자만 등록할 수 있습니다.");
		}
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
}
