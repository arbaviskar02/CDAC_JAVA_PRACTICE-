
public class ArrayOperationsMain {
	
	private static int[] getNameLenghts(String[] namesCopy) {
		int size = namesCopy.length;
		int[] nameLengths = new int[size];
		int index = 0;
		for(String name : namesCopy) {
			int currentLength = name.length();
			nameLengths[index]= currentLength;
			nameLengths[index]= currentLength;
			index++;
		}
		return nameLengths;
	}

	public static void main(String[] args) {
		String[] names = 
		{"Goku","Perona","Light","Luffy","Zoro","Ichigo","Robin"};
//         4	   6		5		5		4		6		5
		int[] allLegths=getNameLenghts(names);
		for(int len : allLegths)
		System.out.println(len);
		
	}

}
