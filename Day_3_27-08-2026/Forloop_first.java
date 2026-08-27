import java.util.*;
public class Forloop_first {
	
	public static void main(String[] args) {
		System.out.println(".....This is Student Grading Program.....");
		System.out.println("\n Enter The Marks For Each Subjects : ");
		Scanner sc = new Scanner(System.in);
		 int sub =0,i =5;
		 int sum = 0, avg =0;
		 
		for(i=0;i<5;i++) {
			
		int marks =sc.nextInt();
		sum = sum +marks;
		avg = sum/5;
		}
		System.out.println("THE Sum is : "+ sum+"\n THE Avg is : "+avg);


	}

	private static Object sub(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
