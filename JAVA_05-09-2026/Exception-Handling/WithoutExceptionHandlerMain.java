package exception_handling;

public class WithoutExceptionHandlerMain {
	// A Program To Accept two Numbers as Command Line arguments and Print their Addition.
	//Command line Arguments....
	public static void main(String args[]) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int result = n1 + n2;
		System.out.println(result);

	}

}
