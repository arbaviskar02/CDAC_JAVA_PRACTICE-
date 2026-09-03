
public class TrainingMain {

	public static void main(String[] args) {
		OfflineTraining tr = new OfflineTraining("OOP using Java",9,"CDAC, Nashik");
		OnlineTraining tr2 = new OnlineTraining(5,"SQL", "https://meet.google.com");
		
		tr.conductTraining();
		System.out.println("_______________________*_____________________\n");
		tr2.conductTraining();
		
		OfflineTraining trt = (OfflineTraining)tr;
		trt.setVenueDetails("Some new Venue!(Replacement Example)");
		System.out.println("_______________________*_____________________\n");

		trt.conductTraining(); // Expansion Example of Method Overriding;
		System.out.println("_______________________*_____________________\n");
		System.out.println(trt.getDetails());
		System.out.println("_______________________*_____________________\n");
		System.out.println(tr2.getDetails());
	}

}
