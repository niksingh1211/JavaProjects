import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//System.out.println(list.size()+ " : "+ list);
		list.add(10);
		list.add(11);
		System.out.println(list.size()+" : "+list);
		
		int sum=0;
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i);			
		}
		System.out.println(sum);
		
		sum =0;
		for(Integer value : list) {
			sum+=value;
		}
		System.out.println(sum);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	
	}	
}
