//Assignment 100: WAP on MAP concepts using its methods

package basicjavaprogram;

import java.util.HashMap;
import java.util.Map;


public class MapInterface1 {

	public static void main(String[] args) {
		
	// String-String
		
		  // 1. Put method
		Map<String, String> m1 = new HashMap <String,String>(); //Map 1 - Upcasting from HashMap to Map. 
		         m1.put("Month 1", "January");
		         m1.put("Month 2", "February");
		         m1.put("Month 3", "March");
		         m1.put("Month 4", "April");
		         m1.put("Month 5", "May");
		         System.out.println(m1);
		         
		  // 2. putAll method        
	   Map<String, String> m2 = new HashMap <String,String>(); //Map 2 - Upcasting from HashMap to Map.          
		        m2.putAll(m1);
		        System.out.println(m2);
		        
		  // 3. isEmpty method    
		 boolean b1 =m2.isEmpty();
		  System.out.println(b1);
		  
		  //4. clear method
		  m2.clear();
		  System.out.println(m2);
		  
		  //5. remove methods
		  m1.remove("Month 1");
		  System.out.println(m1);
		  
		  m1.remove("Month 2", "February");
		  System.out.println(m1);
		  
		  //replace methods
		  m1.replace("Month 5", "?");
		  System.out.println(m1);
		  
		  m1.replace("Month 4", "April", "Guess");
		  System.out.println(m1);
	}

}
