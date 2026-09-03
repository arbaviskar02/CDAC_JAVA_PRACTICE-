
public class PlayerMain {

	public static void main(String[] args) {
		CricketPlayer crPlayer = new CricketPlayer();
		crPlayer.setName("Sachin Tendulkar.");
		crPlayer.setAge(53);
		crPlayer.setRuns(18754);
	
	
		System.out.println(crPlayer.getName());
		System.out.println(crPlayer.getAge());
		System.out.println(crPlayer.getRuns());
		System.out.println("==========================");
		
		
		CricketPlayer crplayer2 = new CricketPlayer("virat",38,14760);
		System.out.println(crplayer2.getName());
		System.out.println(crplayer2.getRuns());
		System.out.println(crplayer2.getAge());

	}

}
