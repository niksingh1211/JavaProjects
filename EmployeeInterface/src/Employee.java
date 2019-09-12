public class Employee {

	private int empId;
	private String empName;
	
	public Employee()
	{
		empId = 1011;
		empName = "Ram";
	}
	
	
	public Employee(int empId,String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
