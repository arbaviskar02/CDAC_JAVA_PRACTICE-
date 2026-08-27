import java.util.*;
public class Discount {

	public static void main(String[] args) {
		int p_amt;
		int d_per = 0;
		int f_amt;
		System.out.println("WELCOME!.....");
		Scanner object = new Scanner(System.in);
		System.out.println("Enter P_amt");

		p_amt = object.nextInt();
		System.out.println("THE P_AMOUNT IS : "+ p_amt);
		if(p_amt>= 5000)
		{ 
			d_per =(p_amt* 20/100);
			System.out.println("THE DISCOUNT % is 20% and d_Amt is : "+d_per);
	}
		else if(p_amt>= 3000)
		{ 
			d_per =(p_amt* 10/100);
			System.out.println("THE DISCOUNT % is 10% and d_Amt is : "+d_per);
	}
		else
		{
			System.out.println("THE DISCOUNT % is 0% and p_Amt is : "+p_amt);

		}
		f_amt = (p_amt - d_per);
		System.out.println("THE FINAL AMOUNT IS : "+f_amt);

}
}
