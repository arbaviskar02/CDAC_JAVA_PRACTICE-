
public class ParameterPassingMain {
	
	private static void changeAge(int ageCopy) {
		 ageCopy= 35;
	}
	private static void changeBook(Book myBookCopy) {
		myBookCopy.setTitle("Black Water");
		myBookCopy.setPrice(985);
	}

	public static void main(String[] args) {
		int age =25;
		System.out.println("Age Before Change : "+age);
		changeAge(age);
		System.out.println("Age After Change : "+age);

		
		System.out.println("==========================");
		Book myBook = new Book("Harry Potter", 1025);
		System.out.println("Book Before Change: \n"+ myBook.getTitle());
		System.out.println(myBook.getPrice());
		System.out.println("==========================");
		
		changeBook(myBook);
		System.out.println("Book After Change: \n"+ myBook.getTitle());
		System.out.println(myBook.getPrice());
		
	}

}
