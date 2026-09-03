
public class EmployeeMain {

	public static void main(String[] args) {
		Employee_ab[] allEmployees = new Employee_ab[3];
		allEmployees[0] = new PermanantEmployee(101,"Ravi Dixit", 75000,12500,8500);
		allEmployees[1] = new ContractualEmployee(102,"Swati Joshi",60000,15500);
		allEmployees[2] = new PermanantEmployee(103,"Meena Naik", 70000,9500,7600);
		for (Employee_ab currentEmployee : allEmployees) {
			String empName = currentEmployee.getName();
			float ProcessedSalary = currentEmployee.processSalary();
			System.out.println("Name: "+ empName);
			System.out.println("Gross Salary: "+ ProcessedSalary);
			System.out.println("___________________________________\n");
		}
		
		
	}

}
