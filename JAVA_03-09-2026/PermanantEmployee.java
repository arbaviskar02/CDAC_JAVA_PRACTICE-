
public class PermanantEmployee extends Employee_ab {
	private float da,hra;
	
	public PermanantEmployee() {
		super();

	}
	public PermanantEmployee(int empNo, String name, float basicSalary, float da, float hra) {
		super(empNo, name, basicSalary);
		this.da = da;
		this.hra = hra;
	}

	public float getDa() {
		return da;
	}


	public void setDa(float da) {
		this.da = da;
	}
	public float getHra() {
		return hra;
	}


	public void setHra(float hra) {
		this.hra = hra;
	}

	@Override
	public float processSalary() {
			float finalSalary = getBasicSalary()+da +hra;
		return finalSalary;
	}

}
