import java.util.*;
public class Tempconv {

	public static void main(String[] args) {
		double t_c;
		
		System.out.println("Enter The Temp in `C : ");
		Scanner sc = new Scanner(System.in);
		t_c = sc.nextDouble();
		 double fh = (double)((t_c*9/5)+32);
		if(t_c<=0)
		{
			System.out.println("Freezing...");

		}
		else if(t_c>=0 && t_c<=15)
		{
			System.out.println("Cold...");

		}
		else if(t_c>=16 && t_c<=30)
		{
			System.out.println("Normal...");

		}
		else
		{
			System.out.println("Hot...");
		}
		System.out.println("Temp in FH is : "+ fh);

	}

}
