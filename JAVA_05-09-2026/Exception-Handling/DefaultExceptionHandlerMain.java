package exception_handling;

public class DefaultExceptionHandlerMain {
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
			System.out.println("Enter at least two numbers... ");
		}
		catch(ArithmeticException ex) {
			System.out.println("Denominator Should not be '0'...");
		}
		catch(Exception ex) {
			System.out.println("Unable to Proceed Due to Some Error!...");
		}
	}
}


//Handling Default Exception:
/*sometimes a block of code may fire an exception which was not thought of while writing,
  The code In this case, Since no exception handlers is found, it result into predefined message.
  this can be addressed by providing a default exception handler.
  The Order Should be from Sub-class towards super-class downwards(IMP Rule).
*/


