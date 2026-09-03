

public class OfflineTraining extends Training {
	private String venueDetails;

	public OfflineTraining() {
		
		
	}

	public OfflineTraining(String module, int duration, String venueDetails) {
		super(module, duration);
		this.venueDetails = venueDetails;
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
	@Override
	public void conductTraining() {//this is an OverRidden Method from training Class;
	System.out.println("Conducting the Training on "+ getModule());
	System.out.println("For "+ getDuration()+ " days");
	System.out.println("at "+ venueDetails);
	}
	@Override
	public String getDetails() { // Expansion Example of Method Overriding;
		String details =super.getDetails();
		return details+ "\n" +"Venue" + venueDetails;
	}
	
}
