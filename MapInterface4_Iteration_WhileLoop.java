//Assignment 106 : WAP to iterate a MAP using Iterator

package basicjavaprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapInterface4_Iteration_WhileLoop {

	public static void main(String[] args) {
	Map<String, Integer> m1 = new HashMap <String,Integer>();
		m1.put("Student A", 1);
		m1.put("Student B", 2);
		m1.put("Student C", 3);
		m1.put("Student D", 4);

		//Iterating Keys using Iterator and while loop
		Iterator <String> keyIterator = m1.keySet().iterator();
		while (keyIterator.hasNext())
			
		{
			System.out.println(keyIterator.next());
		}
		
		
		
		//Iterating Values using Iterator and while loop
		Iterator <Integer> valueIterator = m1.values().iterator();
		while (valueIterator.hasNext())
			
		{
			System.out.println(valueIterator.next());
		}
		
		
		//Iterating Key&Values using Iterator and while loop
		Set<Entry<String,Integer>> entrySet = m1.entrySet();
		Iterator <Entry <String,Integer>> e1 = entrySet.iterator();
				while (e1.hasNext())
			
				{
					Entry<String, Integer> entry = e1.next();
					System.out.println(entry);
				}
			
			
		}
		
		
	}


