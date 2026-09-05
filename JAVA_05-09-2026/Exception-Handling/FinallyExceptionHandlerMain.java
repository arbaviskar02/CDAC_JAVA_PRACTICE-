package exception_handling;

public class FinallyExceptionHandlerMain {
	// A Program To Accept two Numbers as Command Line arguments and Print their Addition.
	//Command line Arguments....
	public static void main(String args[]) {
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int result = n1 / n2;
		System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter at least two numbers... ");
		}
		catch(ArithmeticException ex) {
			System.out.println("Denominator Should not be '0'...");
		}
		catch(Exception ex) {
			System.out.println("Unable to Proceed Due to Some Error!...");
		}
		finally {
			System.out.println("Thank you !!...");
		}
	}

}


/* Using finally(keyword):
 * Java provides one more keyword called as 'finally' that us also to be used in the form of block.
 * It guarantees about statements execution,allows to execute the statement irrespective of whether
 * an exception is raised or not.
 * 
 */
