
import java.util.Scanner;

public class Batmbill {

		public static void main(String[] args) {
			int ch=0;
			double bal = 5000;
			double wit,dip;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("....Welcome to ZP bank....");
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Check Balance \n2. Deposit Money \n3.  \n4. Exit : ");
			
			ch =sc.nextInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("You have : "+bal+" in Your Account!..");

				break;
			case 2:
				
				System.out.println("Enter The Amount you want to Diposit : ");
				 dip =sc.nextDouble();

					bal = (int) (bal+ dip);
					System.out.println("You have : "+bal+" in Your Account!..");
				break;
			case 3:
				System.out.println("Enter The Amount you want to Withdraw : ");
				 wit =sc.nextDouble();
				 if(wit< bal)
				 {
					System.out.println("You have Witdrawn "+wit+"from Your Account!..");
					int rem = (int) (bal-wit);
					System.out.println("You have : "+rem+" Remaining in Your Account!..");

				 }
				 else {
					System.out.println("You Dont have Sufficient amount in Your Account!..");
				 }
		
				break;
			case 4:
				
				System.out.println("Thank You For Banking With us!..");

				break;
			default:
				System.out.println("Enter The Valid Choice : ");
				break;
			}
		}
		}
	


