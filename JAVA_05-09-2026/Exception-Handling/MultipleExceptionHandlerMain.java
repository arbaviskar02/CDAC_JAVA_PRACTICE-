package exception_handling;

public class MultipleExceptionHandlerMain {
	// A Program To Accept two Numbers as Command Line arguments and Print their Division.
	//Command line Arguments....(Using try and Catch).
	public static void main(String args[]) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1 / n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter at least two numbers: ");
		}
		catch(ArithmeticException ex) {
			System.out.println("Denominator Should not be '0'...");
		}
	}
}

// Handling Multiple Exceptions:
//A single block of code may fire different types of exceptions.In this Case,
// These Exceptions can be Handled by providing Multiple catch blocks.
//
