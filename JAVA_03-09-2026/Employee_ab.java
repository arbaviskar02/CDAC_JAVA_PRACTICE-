
public abstract class Employee_ab {
	private int empNo;
	private String name;
	private float basicSalary;
	
	public Employee_ab() {
		
	}

	public Employee_ab(int empNo, String name, float basicSalary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public abstract float processSalary();

}
