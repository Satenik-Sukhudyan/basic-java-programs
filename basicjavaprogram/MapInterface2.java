//Assignment 102: WAP on MAP using methods like get(), containsKey(), containsValue(), putIfAbsent(), equals() 

package basicjavaprogram;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2 {

	public static void main(String[] args) {
		
		Map<String, Integer> m1 = new HashMap <String,Integer>();
		m1.put("Student A", 1);
		m1.put("Student B", 2);
		m1.put("Student C", 3);
		m1.put("Student D", 4);
		System.out.println(m1);
		
		//Get method
		System.out.println(m1.get("Student A"));
		
		//containsKey method
		System.out.println(m1.containsKey("Student C"));
		
		//containsValue method
		System.out.println(m1.containsValue(5));
		
		//putIfAbsent method
		m1.putIfAbsent("New Student", 5);
		System.out.println(m1);
		
		//equals method
		Map<String, Integer> m2 = new HashMap <String,Integer>();
		m2.put("Student A", 0);
		m2.put("Student B", 0);
		m2.put("Student C", 0);
		m2.put("Student D", 0);
		
		boolean b1 = m1.equals(m2);
		System.out.println(b1);
	}

}
