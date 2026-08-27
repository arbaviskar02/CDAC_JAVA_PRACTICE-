import java.util.*;
public class Waterbill {

	public static void main(String[] args) {
		int used;
		double wbill;
		System.out.println("ENTER water in Liters : ");
		Scanner w = new Scanner(System.in);
		used = w.nextInt();
		if(used<=6000)
		{
			wbill = ((used-1000)/100)*5;
		}
		else if(used>6000)
		{
			wbill = ((5000/100)*5)+((used-6000)/100)*8;
		}
		else {
			wbill = 0;
		}
		System.out.println("THE TOTAL Water Bill is :"+wbill);
	}

}
