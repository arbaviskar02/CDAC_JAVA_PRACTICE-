
public class SocialMediaMain {

	public static void main(String[] args) {
		SocialMedia fb = new SocialMedia();
			fb.assignValues("Facebook", 125);
			String fbDetails = fb.retriveValues();
			System.out.println(fbDetails);
			System.out.println("____---------____");
			System.out.println(fb.retriveValues());

	}

}
