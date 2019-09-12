
public class EmployeeMain {
	public static void main(String[] args) {
				
		IEmployee1 emp1 = Employee :: new;
		Employee employee = emp1.getEmployee();
		System.out.println(employee);
		
		IEmployee2 emp2 = Employee :: new;
		Employee employee2 = emp2.getEmployee(1012, "Sham");
		System.out.println(employee2);
		
		
	}

}
