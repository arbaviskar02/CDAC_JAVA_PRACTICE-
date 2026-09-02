
public class CarMain {

	public static void main(String[] args) {
		Car simpleCar, premiumCar;
		/*simple car does not have music system,
		  and it has and engine with basic specifications
		  premiumCar has music system also powerful engine.*/
		
		simpleCar = new Car();
		
		System.out.println(simpleCar.getDescription());
		System.out.println(simpleCar.getPrice());
		//Print power of engine installed in simpleCar.
		//using explicit reference.
		//Obtain the Engine installed in simpleCar.
		Engine simpleEngine = simpleCar.getEngineData();
		String simplePower = simpleEngine.getPower();
		System.out.println(simplePower);
		// Using Object Graph Navigation.
		System.out.println(simpleCar.getEngineData().getPower());//Chaining Method For
		
		System.out.println(simpleCar.getEngineData().getType().toUpperCase());
		System.out.println("==============================");
		
		Engine premiumEngine = new Engine("Diesel","3600 CC");
		MusicSystem premiumMusicSystem = new MusicSystem("Sony","Dolby with 3D Sound");
		premiumCar = new Car("Toyota Fortuner", 3425323,premiumEngine,premiumMusicSystem);
		System.out.println(premiumCar.getDescription());
		System.out.println(premiumCar.getPrice());
		//Print power of engine installed in premiumCar.
		System.out.println(premiumCar.getEngineData().getPower());
		//SoundEffects of MusicSystem installed in premiumCAr.
		System.out.println(premiumCar.getMusicSystemData().getSoundEffect());
		// using Explicit Reference for premiumCar
		MusicSystem currentMusicSystem = premiumCar.getMusicSystemData();
		if(currentMusicSystem != null) {
			String currentSoundEffects = currentMusicSystem.getSoundEffect();
			System.out.println(currentSoundEffects);
		}
		else {
			System.out.println("This Car Doesnt Have any Music System installed");
		}
		System.out.println("+==================================================+");
		// using Explicit Reference for simpleCar
		MusicSystem simpleMusicSystem = simpleCar.getMusicSystemData();
		if(simpleMusicSystem != null) {
			String simpleSoundEffects = currentMusicSystem.getSoundEffect();
			System.out.println(simpleSoundEffects);
		}
		else {
			System.out.println("This Car Doesnt Have any Music System installed");
		}
	}

}
