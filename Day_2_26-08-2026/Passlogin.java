import java.util.*;
public class Passlogin {

	public static void main(String[] args) {
		String auth = "java123",e_pass;
		int chance = 3;
		System.out.println("....THIS is Password login System....");
		Scanner sc = new Scanner(System.in);
		while(chance>0)
		{
			System.out.println("Enter Your pin :"+" you have ("+chance+") Chances remaining");
			e_pass = sc.next();
			if(auth.equalsIgnoreCase(e_pass))// to ignore that case of letters;
			{
				System.out.println("Congratulations password matched....!");
				return;
			}
			else {
				System.out.println("Your Password is Incorrect...!");
			}
			chance--;
		}
		
	}

}
