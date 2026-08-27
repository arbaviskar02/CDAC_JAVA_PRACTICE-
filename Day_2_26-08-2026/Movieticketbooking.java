import java.util.Scanner;

public class Movieticketbooking {


	public static void main(String[] args) {
		int ch=0,qty;
		double bill;
		System.out.println("Enter The Value For Category : ");
		System.out.println("1. Regular 2. Premium 3. VIP : ");
		Scanner sc = new Scanner(System.in);
		
		ch =sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("Enter The number of tickets : ");
			qty =sc.nextInt();

			bill = qty*150 ;
			System.out.println("Bill : "+bill);
			break;
		case 2:
			
			System.out.println("Enter The number of tickets : ");
			qty =sc.nextInt();

			bill = qty* 250;
			System.out.println("Bill : "+bill);
			break;
		case 3:
			
			System.out.println("Enter The number of tickets : ");
			qty =sc.nextInt();

			bill = qty*400 ;
			System.out.println("Bill : "+bill);
			break;
		default:
			System.out.println("Enter The Valid Choice : ");

		}
	}

}
