
public class Person {
	private int age;
	private String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[ name ="+ name+", age ="+age+" ]";
	}
	
	public int sortByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public static int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
