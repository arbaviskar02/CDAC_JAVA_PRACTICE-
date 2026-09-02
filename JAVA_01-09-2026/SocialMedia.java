
public class SocialMedia {

		private String name;
	
		private int userCount;//Millions Users
		
		public void assignValues(String v_name, int v_count) {
			name=v_name;
			userCount = v_count;
		}
		public String retriveValues() {
			String data = "Name : "+name + "\nUserCount (Millions) : "+userCount;
			return data;
			}
	}




