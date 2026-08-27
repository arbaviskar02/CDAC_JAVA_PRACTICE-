import java.util.*;
public class Elecbill {

	public static void main(String[] args) {
		int ct,units,bill;
		System.out.println("Enter The Value For Category : ");
		System.out.println("1. Domestic 2. Commercial 3. Industrial : ");
		Scanner sc = new Scanner(System.in);
		
		ct =sc.nextInt();
		switch(ct)
		{
		case 1:
			
			System.out.println("Enter The Value For Units Consumed : ");
			units =sc.nextInt();

			bill = units* 5;
			System.out.println("Bill : "+bill);
			break;
		case 2:
			
			System.out.println("Enter The Value For Units Consumed : ");
			units =sc.nextInt();

			bill = units* 8;
			System.out.println("Bill : "+bill);
			break;
		case 3:
			
			System.out.println("Enter The Value For Units Consumed : ");
			units =sc.nextInt();

			bill = units* 10;
			System.out.println("Bill : "+bill);
			break;
		default:
			System.out.println("Enter The Valid Choice : ");

		}
	}

}
