//Assignment 92: WAP to iterate a Collection using Iterator

package basicjavaprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Iterator {

	public static void main(String[] args) {
		Collection c1= new ArrayList(); //upcasting (implicit)
		c1.add("Sgfjg");
		c1.add(true);
		c1.add(5.21);
		c1.add(60000);
		c1.add('A');
		
		//Creating an Iterator. It works on any Collection - forward iterations only
	Iterator <Object> it = c1.iterator(); // Using Iteratot ,Object. because the collection contains mixed types
	
	   //Iterating using while loop
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
			    
			    

	}

}
