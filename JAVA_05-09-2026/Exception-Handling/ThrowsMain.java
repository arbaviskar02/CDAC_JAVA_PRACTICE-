package exception_handling;


public class ThrowsMain {
	private static void doTest() throws Exception{
		
	}
	private static void performTest() throws Exception{// CALLED Program.
		
	}
	private static void callPerformTest()  throws Exception{// CALLING Program.
		performTest();
	}
	
	private static void callDoTest() {
		try{
			doTest();
		}
		catch (Exception ex) {
			System.out.println(ex); // we wont see output in this Program..
		}
	}
	private static void invokeDoTest() throws Exception { // Called as Propagation When we delegate it further like in this example
		doTest();
	}
	public static void main(String[] args) {
		callDoTest();
		try {
		invokeDoTest();
		}
		catch(Exception ex) {
			System.out.println(ex);// we can not further delegate throws from main as after main we can't access or handle the starter code
		}
	}

}


/* Other Keywords:
 * other than try,catch,finally Java provides 2 more keywords:
 * 1. throws
 * 2. throw
 * 
 1. throws:
 	  * Used by method and constructor definitions to intimate that they may throw the 
 		Checked exception but willing to handle it;
 		rather their caller must handle it.
 	 	For e.g:
 	  - public void readfile(String fileName) throws file not found exception...
 	  - In The above fragment, method readfile() is intimating compiler that 
 		it may fire an exception: 'fileNotFoundException' but not willing to handle it; 
 		rather its caller must handle it.
 	
 	*RULES:
 	-1.	The CALLING program if uses throws, the type of exception must be equal to the
 		type mentioned by CALLED program or its super-type.
	-2. In method overriding, the overridden method uses throws, it can widen the scope
		but cannot narrow it.

*/