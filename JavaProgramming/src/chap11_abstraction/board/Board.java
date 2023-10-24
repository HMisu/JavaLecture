package chap11_abstraction.board;

public abstract class Board {
	int boardNo;
	String boradTitle;
	String boardContent;
	String boardWriter;
	String boardDate;

	public Board() {

	}

	public Board(int boardNo, String boadTitle, String boardContent, String boardWriter, String boardDate) {
		this.boardNo = boardNo;
		this.boradTitle = boadTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoradTitle() {
		return boradTitle;
	}

	public void setBoradTitle(String boadTitle) {
		this.boradTitle = boadTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public abstract void insertBoard();

}
