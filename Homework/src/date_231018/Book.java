package date_231018;

public class Book {
	public String title;
	public String writer;
	public String publisher;
	public int price;

	public Book() {

	}

	public Book(String title, String writer, String publisher, int price) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}

	public void bookInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자:" + writer);
		System.out.println("출판사: " + publisher);
		System.out.println("가격: " + price);
	}
}
