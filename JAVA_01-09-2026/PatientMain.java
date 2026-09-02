
public class PatientMain {

	public static void main(String[] args) {
		Patient pt = new Patient();
		pt.setPatientId("p1");
		pt.setName("Rohit dubey");
		pt.setBloodGroup("A+ve");
		pt.setHeight(175);
		pt.setWeight(89.65f);
		pt.setDiabetic(false);
		
		String ptName = pt.getName();
		boolean  diabetic = pt.isDiabetic();
		if(diabetic) {
			System.out.println("Hello "+ptName+ ", You need to Start Walking");
			
		}
		else {
			System.out.println("hi "+ ptName + ", Enjoy your Sweets...");
		}
		

	}

}
