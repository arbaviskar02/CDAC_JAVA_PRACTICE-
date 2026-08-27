import java.util.*;
public class Mkbta {
	public static void main(String[] args) {
		int p1q;
		int p1p;
		int p2q;
		int p2p;
		System.out.println("Enter the Quantity and Price for peoduct-1");
		Scanner sc = new Scanner(System.in);
		p1q = sc.nextInt();
		p1p = sc.nextInt();
		p2q = sc.nextInt();
		p2p = sc.nextInt();
		int total =(p1q*p1p)+(p2q*p2p);
		double final_amount = total;
		if(total>1000)
		{
			final_amount =total-(total*0.05);
			System.out.println("Your discount: "+(total*0.05));

		}
		System.out.println("Your Total bill: "+final_amount);
	}
}
