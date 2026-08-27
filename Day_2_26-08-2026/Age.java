import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		int age;
		int t_price = 0;

		System.out.println("WELCOME!.....");
		Scanner object = new Scanner(System.in);
		System.out.println("Enter THE Age");

		age = object.nextInt();
		System.out.println("THE Age is : "+ age);
		if(age<12)
		{ 
			
			System.out.println("THE Ticket Amout is : "+100);
	}
		else if(age>60)
		{ 

			System.out.println("THE Ticket Amout is : "+150);
	}
		else
		{
			System.out.println("THE Ticket Amout is : "+120);

		}


}
}
