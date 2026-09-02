
public class ArraySimpleExampleMain {

	public static void main(String[] args) {
		// Declaring an Array of 5 integers called as numbers
		int[] numbers = new int[5];
		numbers[0] =26;
		numbers[1] =45;
		numbers[2] =76;
		numbers[3] =89;
		numbers[4] =90;
		
		int arraySize = numbers.length;
		for(int i =0;i<5;i++) {
			int number = numbers[i];
			System.out.println(number);
		}
//		System.out.println("\n\n"+arraySize);
		System.out.println("==============================");
		for(int val: numbers) {
			System.out.println(val);
		}
		
		

	}

}
