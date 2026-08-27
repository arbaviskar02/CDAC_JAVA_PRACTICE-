/*
 * Write a program read value from user
 * productname rate of product quantity
 * and calculate amount
 * assign discount 10% on amount
 * caclualte net amount
 *
 */
import java.util.*;
public class Sales {

	public static void main(String[] args) {
		String productname = null;
		float rate;
		int quantity;
		double amount;
		float discount;
		System.out.println("its program for Sales : ");
		Scanner object = new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		productname = object.next();
		System.out.println("Product Name Is : "+productname);
		System.out.println("Enter The value for Rate : ");
		rate = object.nextFloat();
		System.out.println("The value for Rate Is : "+ rate);
		System.out.println("Enter The value for Quantity : ");
		quantity = object.nextInt();
		System.out.println("The value for Quantity Is : "+ quantity);
	}

}
