import java.util.*;
public class Libfine {

	public static void main(String[] args) {
		int days;
		double fine;
		System.out.println("ENTER number of Days book was taken : ");
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
		if(days<=5)
		{
			fine = (days*2);
		}
		else if(days>=6 && days<=10)
		{
			fine = (days*3);
		}
		else {
			fine = (days*5);
		}
		System.out.println("The Total Fine is : "+ fine);
	}

}
