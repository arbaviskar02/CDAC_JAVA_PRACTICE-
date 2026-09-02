
public class Book {
	private String title;
	private int price;
	static int bookCount;
	private static int totalNumberofBooks;
	     
	public static int getTotalNumberofBooks() {
		return totalNumberofBooks;
	}
	 public Book() {
		title ="Roman Holiday";
		price =375;
		bookCount++;
		totalNumberofBooks++;
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
		bookCount++;
		totalNumberofBooks++;

	}
	public Book(int price, String title) {
		super();
		this.price = price;
		this.title = title;
		bookCount++;
		totalNumberofBooks++;

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
