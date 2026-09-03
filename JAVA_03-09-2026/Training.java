
public class Training {
	private String module;
	private int duration;
	public Training() {
		
		
	}
	public Training(String module, int duration) {
		super();
		this.module = module;
		this.duration = duration;
	}
	public Training(int duration, String module) {
		super();
		this.duration = duration;
		this.module = module;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void conductTraining() {}// This is an Empty Implementation;
	
	
	public String getDetails() { // Expansion Example of Method Overriding;
		String details ="Module: "+module + "\nDuration (Days): " + duration;
		return details;
	}

}
