// student attendance system

import java.util.Scanner;

public class Team_performance {

	public static void main(String[] args) {
		System.out.println(".......Students Attendance System.......");
		int att=0,i=10;
		double suma = 0,sump = 0,per=0,total =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter The attendance for 30 days : ");
		for(i=0;i<=10;i++) {
			att =sc.nextInt();
			if(att==1) {
			 sump = sump+1;
			}
			else if(att==0) {
				suma = suma+1;
			}
			total = total+ att;
		}
		per = (total/10)*100;
		System.out.println("The Total Present Days : "+ sump);
		System.out.println("The Total Absent Days : "+ suma);
		System.out.println("The Total attendance : "+ total);
		System.out.println("The Attendance percentage is : "+ per+"%");


	}

}
