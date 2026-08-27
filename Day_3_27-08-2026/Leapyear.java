import java.util.*;

public class Leapyear {
	 public static void main(String[] args) {
	
		System.out.println("Enter a Year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
//		if(year%400==0 || (year% 4 == 0 &&year%100 != 0))
//		{
//			System.out.println("This is Leap year!.....");
//			
//		}
//		else {
//			System.out.println("This is not a Leap year!....");
//		}
		//ternary Operator
		//(condition) ? True result: False result
		String result = (year%400==0 || (year% 4 == 0 &&year%100 != 0))?"This is Leap year!.....":"This is not a Leap year!....";
		System.out.println(result);
	}
}
