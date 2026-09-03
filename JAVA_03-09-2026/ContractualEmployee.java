
public class ContractualEmployee extends Employee_ab {
	private float variablePay;
	
	public ContractualEmployee(int empNo, String name, float basicSalary, float variablePay) {
		super(empNo, name, basicSalary);
		this.variablePay = variablePay;
	}

	public ContractualEmployee() {
		super();
		}
	
	public float getVariablePay() {
		return variablePay;
	}

	public void setVariablePay(float variablePay) {
		this.variablePay = variablePay;
	}

	@Override
	public float processSalary() {
		float finalSalary =getBasicSalary()+ variablePay;
		return finalSalary;
	}

}
