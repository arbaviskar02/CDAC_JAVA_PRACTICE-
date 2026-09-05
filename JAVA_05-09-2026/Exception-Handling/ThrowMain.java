package exception_handling;

public class ThrowMain {
	private static int doDivide(int x, int y) {
		if(y==0) {
			RuntimeException rx = new RuntimeException("Unable to perform Division due to y being 0;...");
			throw rx;
		}
		return x/y;
	}
	public static void main(String[] args) {
		try {
		System.out.println(doDivide(400, 19));
		System.out.println(doDivide(49, 12));
		System.out.println(doDivide(70, 0));
		}
		catch(RuntimeException rxRef) {
			String errorMessage = rxRef.getMessage();
			System.out.println(errorMessage);}

	}

}


/*
2. throw:
	  * Sometimes it is necessary to throw the exception explicitly instead of waiting 
	   for JRE to throw it.
	   This is possible by using throw.
	   It allows to throw the exception forcefully based upon certain condition.
*/ 

