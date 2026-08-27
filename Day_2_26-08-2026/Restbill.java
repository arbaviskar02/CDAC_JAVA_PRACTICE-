import java.util.*;
public class Restbill {

	public static void main(String[] args) {
		int qty,bill,ch;
		System.out.println("WELCOME TO RESTAURENT....");
		System.out.println("1. Pizza 2. Burger 3. Sandwich 4. Coffee");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter The Quantity : ");
			qty =sc.nextInt();
			bill = qty *200;
			System.out.println("Bill : "+bill);
			break;
		case 2:
			System.out.println("Enter The Quantity : ");
			qty =sc.nextInt();
			bill = qty *150;
			System.out.println("Bill : "+bill);
			break;
		case 3:
			System.out.println("Enter The Quantity : ");
			qty =sc.nextInt();
			bill = qty *100;
			System.out.println("Bill : "+bill);
			break;
		case 4:
			System.out.println("Enter The Quantity : ");
			qty =sc.nextInt();
			bill = qty *80;
			System.out.println("Bill : "+bill);
			break;
		default:
			System.out.println("Enter The Valid Choice!...");

		}


		

	}

}
