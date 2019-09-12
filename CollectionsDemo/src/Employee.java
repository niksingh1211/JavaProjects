
public class Employee {
	
	private int empId;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(int empId, String name, String designation, double salary) {
		
		this.empId = empId;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
		
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
