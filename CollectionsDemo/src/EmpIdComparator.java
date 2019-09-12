import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		Integer empId1 = o1.getEmpId();
		Integer empId2 = o2.getEmpId();
		
		
		if(o1.getDesignation().compareTo(o2.getDesignation())==0)
		{
			return o1.getDesignation().compareTo(o2.getDesignation());
		}
		return empId1.compareTo(empId2);
		
	}

}
