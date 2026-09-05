package exception_handling;

public class WithExceptionHandlerMain {
	// A Program To Accept two Numbers as Command Line arguments and Print their Addition.
	//Command line Arguments....(Using try and Catch).
	public static void main(String args[]) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1 + n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter at least two numbers: ");
		}
	}
}
//java provides a exception specific class for every abnormal situation
 // this classes are arranged in specific hierarchy called Exception hierarchy
// The hierarchy 
//Error: it indicates due to runtime error due to resource exhaustion, memory problem, etc..
// It is rare and fatal.
//It is not under The control of The Developer.
//Errors are described using several further sub-classes.
//1. OutOfMemory Error
//2. StackOverFlowError
//Exception: 
// It indicates a runtime error due to Programming mistakes.
//It is Frequent but not fatal
// it is under control of developer.
// THERE are 2 Types of Exception:
//1. UNCHECKED
//2. CHECKED
//	UNCHECKED Exception:
//It is an exception About which compiler does not Enforce to Handle.
//It is Expressed using a class using (Unchecked)RuntimeException.
// Any class Descended From it also becomes an unchecked Exception.
//    e.g : ArrayIndexOutOfBoundException, NullPointerException

// 	CHECKED Exception: 
// Its an Exception About witch Compiler Enforces to handle.
// Any Class That is not descended from RuntimeException becomes a CHECKED EXCEPTION.
// e.g - FileNotFoundException, ClassNotFoundException, etc.
//
