//Assignment 103: WAP to fetch all the keys present in map
//Assignment 104: WAP to fetch all the values present in map
//Assignment 105: WAP to fetch both keys&values present in map

package basicjavaprogram;

import java.util.HashMap;
import java.util.Map;

public class MapInterface3 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap <String,Integer>();
		m1.put("Student A", 1);
		m1.put("Student B", 2);
		m1.put("Student C", 3);
		m1.put("Student D", 4);
		
	//Assignment 103: WAP to fetch all the keys present in map	
		System.out.println ("Keys are: " + m1.keySet());
		
	//Assignment 104: WAP to fetch all the values present in map	
		System.out.println ("Values are: " + m1.values());
		
	//Assignment 105: WAP to fetch both keys&values present in map
		System.out.println ("Keys and Values are: " + m1.entrySet());

	}

}
