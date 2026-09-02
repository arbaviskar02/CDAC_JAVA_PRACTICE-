
public class WaterBottleMain {

	public static void main(String[] args) {
		WaterBottle smallBottle =new WaterBottle();
		WaterBottle mediumBottle =new WaterBottle();
		WaterBottle largeBottle =new WaterBottle();
		//For Small;
		smallBottle.make ="Bisleri";
		smallBottle.volume =100;
		smallBottle.price =5.25f;
		
		System.out.println("Small Bottle Details: ");
		System.out.println("Make : "+smallBottle.make);
		System.out.println("Volume : "+smallBottle.volume);
		System.out.println("Price : "+smallBottle.price+" Rs");
		
		//For Medium;
		mediumBottle.make ="Aquafina";
		mediumBottle.volume =250;
		mediumBottle.price =10.25f;
		
		
		System.out.println("\n");
		System.out.println("Medium Bottle Details: ");
		System.out.println("Make : "+mediumBottle.make);
		System.out.println("Volume : "+mediumBottle.volume);
		System.out.println("Price : "+mediumBottle.price +" Rs");
		//For Large;
		largeBottle.make ="Campa";
		largeBottle.volume =500;
		largeBottle.price =15.25f;
		System.out.println("\n");
		

		System.out.println("Large Bottle Details: ");
		System.out.println("Make : "+largeBottle.make);
		System.out.println("Volume : "+largeBottle.volume);
		System.out.println("Price : "+largeBottle.price+" Rs");
		

	}

}
