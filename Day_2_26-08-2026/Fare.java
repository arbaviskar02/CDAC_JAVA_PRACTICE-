import java.util.*;
public class Fare {

	public static void main(String[] args) {
		int dist;
		double fare;
		System.out.println("ENTER YOUR DISTANCE : ");
		Scanner d = new Scanner(System.in);
		dist =d.nextInt();
		if(dist> 20)
		{
			fare = (50 +(20*10)+((dist -20)* 8));
		}
		else {
			fare = 50+ (dist*10);
		}
		System.out.println("THE TOTAL FARE IS : "+fare);
	}
	

}
