/*  Roll No 6:
 *  Q.1 Write a program which implement the bank
 * FD Formula
 * si=p*r*n/100
 * amount=p+si;
 * *
 */
import java.util.*;
public class Bank {

	public static void main(String[] args) {
	 int p;
	 float r;
	 int n;
	 float si;
	 int total;
	 System.out.println("This is Bank Program...! ");

	 System.out.println("ENTER THE VALUES FOR p,r,n : ");
	 Scanner object = new Scanner(System.in);
	 p =object.nextInt();
	 r = object.nextFloat();
	 n = object.nextInt();
	 si=(int)(p*r*n/100);
	 total = (int)(p +si);
	 System.out.println("THE si is : "+si);
	 System.out.println("THE Total Amount is : "+total);
	 }

}
