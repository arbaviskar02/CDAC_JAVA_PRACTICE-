
public class BookMain {
	static {
		System.out.println("BookMain class is getting loaded....");
	}


	public static void main(String[] args) {
		int val=5;
		System.out.println(val);
		System.out.println("BookMain execuation begins...");
		Book b1 = new Book();
		Book b2 = new Book("Sunny Days",575);
		Book b3 = new Book(480,"Final Destination");
		System.out.println("Number Of Books : "+ Book.bookCount);
		System.out.println(b1.getPrice());
		Book b4 = new Book(780,"Mother Of Learning");
		Book b5 = new Book();
		for(int a=1;a<=10;a++)
			new Book();
		System.out.println("Number Of Books : "+ Book.bookCount);
		System.out.println("Number Of Books : "+ Book.getTotalNumberofBooks());
		System.out.println(b2.getTitle());
		System.out.println(b2.getPrice());
		
	}

}
