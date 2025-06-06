//Assignment 94: WAP to iterate a List using Iterator

package basicjavaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListProperty2 {

	public static void main(String[] args) {
		
		List <String> fruits = new ArrayList <String> ();
		
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("orange");
		
		System.out.println(fruits);
		
		//Create an Iterator - we can do it in 2 ways
		
		//1st
	    //Iterator <String> it = fruits.iterator(); // Works on any Collection - forward iterations only
	    
	    //2nd
		ListIterator <String> it = fruits.listIterator(); // Works on List - forward and backward iterations
		
		
		
		//Using next() and hasNext() to iterate - While loop
		
	//forward iteration	
	while (it.hasNext()) //condition that checks if there is another(next)element in the list - the loop stops when hasNext() returns false (no more elements)
		
		{
			
		System.out.println(it.next());  //it.next - Gets (returns) the next element in the list in case the condition is true
		
		}
	
	//backward iteration		
   while (it.hasPrevious()); // returns true if the there's a previuos element in the list. Loop continues while true
   
      {
		
		System.out.println(it.previous()); 
		
		}
   
	
	
	
	}

}
