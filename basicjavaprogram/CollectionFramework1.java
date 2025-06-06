package basicjavaprogram;

import java.util.ArrayList;
import java.util.Collection;

/*Assignment 90:WAP on collection concept with the help of Upcasting on Different Data types (Int, Char, Double, string etc.) 
 with different methods like Add, Remove, Contains.
 */
public class CollectionFramework1 {

	public static void main(String[] args) {
		
		//Add method
		Collection c1= new ArrayList(); //upcasting (implicit)
		c1.add("Sgfjg");
		c1.add(true);
		c1.add(5.21);
		c1.add(60000);
		c1.add('A');
		
		System.out.println(c1); //Collection stores values in it in the form of Object
		
		//Remove method
		Collection c2= new ArrayList(); //upcasting (implicit)
		//c2.add("Sgfjg");
		//c2.add(true);
		//c2.add(5.21);
		//c2.add(60000);
		//c2.add('A');

		//Also I can use addAll() method instead of adding one by one
		c2.addAll(c1);
		
		c2.remove("Sgfjg");
		c2.remove(true);
		c2.remove(5.21);
		c2.remove(60000);
		c2.remove('A');
		
		System.out.println(c2);
		
		//Contains method
		Collection c3= new ArrayList(); //upcasting (implicit)	
		//c3.add("Sgfjg");
		//c3.add(true);
		//c3.add(5.21);
		//c3.add(60000);
		//c3.add('A');
		
		//Also I can use addAll() method instead of adding one by one
		 c3.addAll(c1);

		c3.contains("Sgfjg");
		c3.contains (true);
		c3.contains(5.21);
		c3.contains(60000);
		c3.contains('A');
		
		System.out.println("Values in c3: " + c3); 
		
		//I can also use contains with boolean as its return type is boolean, example:
		boolean b1 = c3.contains(60000);
		System.out.println(b1); 
				
	}

}
