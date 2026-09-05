package multithreading;

public class GreetingThread extends Thread {
	// Some Logic
	public void run() {
		System.out.println("Welcome to multithreading.....");
		}
	
	
	
	
	
	
	
	
	
	
	

}



/*	Multi-Threading:
-	Multi-Threading involves executing multiple threads at same time.
-	Thread is an entity within a process an it defines a path of execution 
-	A process may involve several sub-task and every sub-task is taken care by thread.
* 		-   It is a 2nd Form of MultiTasking.(1st is Multi-processing).
* 		-	It allows to use CPU time Effectively.
* 		-	It allows to Handle Functionality asynchronously.
* 			
* Implementing Multi-Threading: 
* 		-	In order to implement multithreading, it is necessary to create a Java 
* 			 class That is called as a Thread implementation class 
* 		-	This class is meant for providing logic of the thread.
* 
* 		- 	In Order to mark that class as thread implementation class, it has to 
* 		     make use of some API from java.lang package
* 				1. Thread (class)
* 				2. Runnable (Interface)
* 		-	The Implementation class has to either extend Thread or implement Runnable.
		- 	Further it has to implement run() method that is responsible for providing
			the actual logic of the thread.


*/