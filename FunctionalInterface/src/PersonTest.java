import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
	
	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		
		String s[] = {"zbc", "bcd", "aef", "xgh"};
		
		for(int i=0; i<4;i++) {
			person.add(new Person(s[i], i+10));
		}
		
		System.out.println(person +"\n");
		
		Person person2 = new Person();
		
//		Collections.sort(person,person2::sortByName);
//		System.out.println(person);
		
		Collections.sort(person, Person::compareByName);
		System.out.println(person);
	}

}
