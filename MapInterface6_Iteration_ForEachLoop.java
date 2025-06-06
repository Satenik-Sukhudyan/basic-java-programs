package basicjavaprogram;
//Assignment 106 : WAP to iterate a MAP using Iterator

import java.util.HashMap;
import java.util.Map;

public class MapInterface6_Iteration_ForEachLoop {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap <String,Integer>();
		m1.put("Student A", 1);
		m1.put("Student B", 2);
		m1.put("Student C", 3);
		m1.put("Student D", 4);

		//Iterating Keys using for-each loop
		System.out.println("Keys:");
		for (String key : m1.keySet()) 
		{
			System.out.println(key);
		}	
			
	   //Iterating Values using for-each loop
		System.out.println("Values:");
		for (Integer value : m1.values()) 
		{
		System.out.println(value);
		}
		
		
		//Iterating Key-Value pairs using for-each loop
	    System.out.println("Key-Value pairs:");
		for (Map.Entry<String, Integer> entry : m1.entrySet()) 
		{
		System.out.println(entry);
		}
		
		
		

	}

}
