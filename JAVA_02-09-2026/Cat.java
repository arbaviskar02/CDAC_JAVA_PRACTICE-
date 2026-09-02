
public class Cat {
	private int catId;
	private String name;
	private String breed;
	private String color;
	private float age;
	
	public Cat() {
		catId = 1;
		name = "Jinny";
		breed ="Persian";
		color = "white";
		age = 2.3f;
	}
	
	public Cat(int catId, String name, String breed, String color, float age) {
		super();
		this.catId = catId;
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	public Cat(String name, String breed, String color, float age, int catId) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.catId = catId;
	}

	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void walk() {
		String myData = 
				"Hi all, I am "+ name + 
				"\nMy ID is "+ catId + "\nMy breed is "+breed + 
				"\nI am "+age + " years old, my color is "+color+
				"\nand I am walking in my own style";
		System.out.println(myData);
		
	}
	
	
}
