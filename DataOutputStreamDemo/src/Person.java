
import java.io.Serializable;

public class Person implements Serializable{
	public static final long serialVersionUID = 1L;
	public transient String name;
	public int age;
	public String address;
	
	public Person(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+address;
	}
	
}
class Student extends Person{
	public Student(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
}