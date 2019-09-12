import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {
	public static void main(String[] args) {
		Set<Employee> employees = new TreeSet<>(new EmpIdComparator());
		
		employees.add(new Employee(10, "ABC", "Manage", 3500));
		employees.add(new Employee(11, "BCD", "Manaer", 3500));
		employees.add(new Employee(12, "DEF", "Manger", 3500));
		employees.add(new Employee(13, "FGH", "Maager", 3500));
		employees.add(new Employee(14, "IJK", "Mnager", 3500));
		System.out.println(employees.size());
		for (Employee employee : employees) {
			System.out.println(employee.getEmpId()+" "+employee.getName()+ " "+employee.getDesignation()+" "+employee.getSalary());
		}
	}
}
