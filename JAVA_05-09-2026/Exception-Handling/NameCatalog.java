package exception_handling;

public class NameCatalog {
	private static String[] allNames = 
		{"Vicky","Varun","Kirti","Deepika","ranveer"};
	public static int getPosition(String name) throws NameNotFoundException {
		int position = -1;
		int size = allNames.length;
		for(int i=0;i<size;i++) {
			String currentName = allNames[i];
			if(name.equals(currentName)) {
				position = i;
				break;
			}
		}
		if(position == -1) {
			NameNotFoundException nx =
					new NameNotFoundException(name, "Unable to find name in the catalog");
			throw nx;
		}
		return position;
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