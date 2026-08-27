import java.util.*;
public class Avgmarks {

	public static void main(String[] args) {
		int sub1,sub2,sub3;
		double avg;
		System.out.println("ENTER MARKS FOR SUB1, SUB2, SUB3 : ");
		Scanner marks = new Scanner(System.in);
		sub1 = marks.nextInt();
		sub2 = marks.nextInt();
		sub3 = marks.nextInt();
		avg =((sub1 + sub2 + sub3)/3);
		if((sub1>= 35)&&(sub2>= 35)&&(sub3 >= 35) && avg>=40)
		{
			System.out.println("RESULT : PASS....!");
		}
		else {
			System.out.println("RESULT : Fail....!");
		}
		System.out.println("AVG MARKS ARE : "+ avg);
	}
	

}
