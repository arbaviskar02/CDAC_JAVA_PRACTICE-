import java.util.*;

public class Numguessinggame {

	public static void main(String[] args) {
		Random obj = new Random();
		int no = obj.nextInt(5), un;
		System.out.println("Enter Your guess : ");
		Scanner sc = new Scanner(System.in);
		un = sc.nextInt();
		
		while(un != no)
		{
			System.out.println("Try Again: ");
			un = sc.nextInt(); 
		}
		System.out.println("Congratulations!... " + un);

	}
}
