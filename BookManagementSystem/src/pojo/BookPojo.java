package pojo;

public class BookPojo {
	
	private int bookID; //unique id for each book
	private String bookTitle;
	private String bookAuther;
	private String bookGenre;
	private int bookCost;
	private String bookImageURL;
	
	public BookPojo() {
		super();
	}

	public BookPojo(int bookID, String bookTitle, String bookAuther, String bookGenre, int bookCost,
			String bookImageURL) {
		super();
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.bookAuther = bookAuther;
		this.bookGenre = bookGenre;
		this.bookCost = bookCost;
		this.bookImageURL = bookImageURL;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuther() {
		return bookAuther;
	}

	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookImageURL() {
		return bookImageURL;
	}

	public void setBookImageURL(String bookImageURL) {
		this.bookImageURL = bookImageURL;
	}

	@Override
	public String toString() {
		return "BookPojo [bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuther=" + bookAuther + ", bookGenre="
				+ bookGenre + ", bookCost=" + bookCost + ", bookImageURL=" + bookImageURL + "]";
	}
	
	
}
