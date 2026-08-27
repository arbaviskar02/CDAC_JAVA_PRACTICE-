import java.util.*;
public class Empinfo {

	public static void main(String[] args) {
		int id;
		double salary;
		long mobile_number;
		String email;
		String gender;
		float shift_time;
		boolean isPresent;
		String name;
		// To Display output on screen
	System.out.println("Enter Employee Details");
	System.out.println("Name,ID,Salary,Mobile No,Email,Gender");
		//Create scanner class object to use respective  Scanner class method
		Scanner object= new Scanner(System.in);
	   // To Accept input from user screen
		id = object.nextInt();
		name = object.next();
		salary = object.nextDouble();
		mobile_number = object.nextLong();
		email = object.next();
		gender = object.next();
		shift_time = object.nextFloat();
		isPresent = object.nextBoolean();
		System.out.println("You have entered ID: "+id);
		System.out.println("You have entered Name: "+name);
		System.out.println("You have entered Salary: "+salary);
		System.out.println("You have entered Mobile Number: "+mobile_number);
		System.out.println("You have entered Email: "+email);
		System.out.println("You have entered Gender: "+gender);
		System.out.println("You have entered Shift Time: "+shift_time);
		System.out.println("You have entered Is Present: "+isPresent);
		int a= 5;
		int b = 6;
		int c = a++ + ++b;
		System.out.println(c);
	}
	

}
