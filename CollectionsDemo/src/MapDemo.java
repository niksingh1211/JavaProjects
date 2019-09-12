import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(123, "ABC");
		map.put(345, "BCD");
		map.put(456, "DEF");
		map.put(123, "IJK");
		
//		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		for(Integer key: keys)
		{
			String value = map.get(key);
			
			System.out.println(key + " : "+ value);
		}
		System.out.println("---------------------------------");
		
		Collection<String> values =  map.values();
		for(String value: values) {
			System.out.println(value);
		}
		System.out.println("---------------------------------");
		
		Set<Entry<Integer, String>> entry= map.entrySet();
		for(Entry<Integer, String>entry2 : entry) {
			System.out.println(entry2.getKey()+" : "+entry2.getValue());
		}
	}

}
