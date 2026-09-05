package exception_handling;

public class CombinedExceptionHandlerMain {
	// A Program To Accept two Numbers as Command Line arguments and Print their Division.
	//Command line Arguments....(Using try and Catch).
	public static void main(String args[]) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1 / n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			if(ex instanceof ArrayIndexOutOfBoundsException)
			System.out.println("Enter at least two numbers: ");
			else
				System.out.println("Denominator Should not be '0'...");
		}

	}
}

//
//Combining catch Blocks:
//It is possible to combine multiple catch blocks into a single one.
//It is feature introduce by Java version '7.0'.It uses a bitwise OR operator '|'.
//Since a single catch block is defined to handle different Type of exception, 
//It is necessary to identify the type of exception so that based upon which an appropriate action can be taken.
// This is done using 'instanceof' keyword.
// It cannot be used without appropriate rules.
//If exception specific classes represent IS-A relationship(Inheritance). This feature cannot be used.
// i.e classes should be siblings exceptions not parent child.
