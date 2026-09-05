package exception_handling;

public class NameNotFoundException extends Exception {
	private String invalidName;

	public NameNotFoundException(String invalidName,String errorMessage) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	@Override
	public String getMessage() {
		String message = super.getMessage() + ": " + invalidName;
		return message;
	}
	
	}




/*
 * User Defined Exception:
 - 	  Sometimes Depending upon the domain requirements, it is necessary to create 
 	   our own  exception and throw it upon some condition.
 -	  Such exceptions are called as user defined exceptions.
 -	  User Defined exceptions are created by defining a Java class that is referred
  	   as exception specific class.
 -	  However, this class has to inherit from some predefined exception 
 	   specific class to mark it as exception Specific class.
 - 	  In general, it is inherited from RuntimeException if the requirement is for 
 	   UNCHECKED exception; otherwise it is inherited from Exception if the requirement 
 	   is for CHECKED exception.
 */