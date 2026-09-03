
public class OnlineTraining extends Training {
	private String meetingLink;

	public OnlineTraining() {

	}

	public OnlineTraining(int duration, String module, String meetingLink) {
		super(duration, module);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	//IMP TO LOOK FOR;
	@Override
	public void conductTraining() {//this is an OverRidden Method from training Class;
	System.out.println("Conducting the Training on "+ getModule());
	System.out.println("For "+ getDuration()+ " days");
	System.out.println("at "+ meetingLink);
	}
	@Override
	public String getDetails() { // Expansion Example of Method Overriding;
		String details =super.getDetails();
		return details + "\n" + "Meeting Link: " + meetingLink;
	}
}
