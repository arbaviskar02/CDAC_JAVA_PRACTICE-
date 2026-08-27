import java.util.*;
public class Printingpattern {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 for(int i=0;i<5;i++) {
		  
		 for(int j=0;j<5;j++) {
			System.out.print(" * ");
		 }
		 System.out.println("\n");
	 }
	 System.out.println("\n");
	 for(int i=0;i<5;i++) {
		  
		 for(int j=0;j<=i;j++) {
			System.out.print(" * ");
		 }
		 System.out.println("\n");
	 }
//	 System.out.println("\n");
	 for(int i=4;i>0;i--) {

		 for(int j=i;j>0;j--) {
			System.out.print(" * ");
		 }
		 System.out.println("\n");

	 
 }
	 int sp = 4;
//	 
	 System.out.println("\n");
	 for(int i=0;i<5;i++) {
	
		 for(int j=0;j<sp;j++) {
			 
			System.out.print("   ");
		 }
		 	for(int k=0;k<=i;k++) {
				System.out.print(" * ");

		 	}
		 	sp--;


		 System.out.println("\n");
	 }

 }
}
