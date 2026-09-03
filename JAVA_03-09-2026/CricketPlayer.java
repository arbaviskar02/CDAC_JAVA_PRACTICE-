
public class CricketPlayer extends Player {
	private int runs;
	

	public CricketPlayer() {
		System.out.println("Inside CricketPlayer()");
	}
	
	public CricketPlayer(String name,int age, int runs) {
		super(name,age);
		this.runs =runs;
	}
	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
