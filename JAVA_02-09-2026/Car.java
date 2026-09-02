
public class Car {
	//Description, Price, Engine, Music system
	private String description;
	private int price;
	private Engine engineData;
	private MusicSystem musicSystemData;
	
	public Car() {
		description = "Hyundai Grand I10";
		price = 975000;
		engineData = new Engine();
		//Not initializing Music data cause by default car does not have it.
//		musicSystemData = new MusicSystem();
	}

	public Car(String description, int price, Engine engineData, MusicSystem musicSystemData) {
		super();
		this.description = description;
		this.price = price;
		this.engineData = engineData;
		this.musicSystemData = musicSystemData;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngineData() {
		return engineData;
	}

	public void setEngineData(Engine engineData) {
		this.engineData = engineData;
	}

	public MusicSystem getMusicSystemData() {
		return musicSystemData;
	}

	public void setMusicSystemData(MusicSystem musicSystemData) {
		this.musicSystemData = musicSystemData;
	}
	

}
