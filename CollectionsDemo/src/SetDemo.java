import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		System.out.println(set);
		
		set = new LinkedHashSet<>();
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		System.out.println(set);
		
		set = new TreeSet<>();
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(20);
		set.add(30);
		
		System.out.println(set);
	}

}
