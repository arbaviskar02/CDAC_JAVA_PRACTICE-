
public class CatMain {

	public static void main(String[] args) {
		Cat myCat =new Cat();
		Cat yourCat = new Cat(2,"Luna","Manacoon","Jet Black",2.4f);
		Cat ourCat = new Cat(3,"Trixy","Short Hair","Cloudy White",.4f);
//		myCat.setCatId(1);
//		myCat.setName("Jinny");
//		myCat.setBreed("Persian");
//		myCat.setColor("White");
//		myCat.setAge(4.3f);
		
		myCat.walk();
		System.out.println("===========================");
		yourCat.walk();
		System.out.println("===========================");
		ourCat.walk();


	}

}
