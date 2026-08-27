import java.util.*;
public class Scholarship {

	public static void main(String[] args) {
		int marks;
		double income;
		System.out.println("Enter your Marks and Income : ");
		Scanner object = new Scanner(System.in);
		marks = object.nextInt();
		income = object.nextDouble();
		if((marks>=90)||(marks>=85 && income<200000))
		{
			System.out.println("You are Eligible for Scholarship!..");
		}
		else {
		
			System.out.println("You are Not Eligible for Scholarship!..");
		
	}
	}

}
