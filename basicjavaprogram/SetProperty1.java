//Assignment 96: WAP on Set concepts using its methods
//Assignment 97: WAP to iterate a Set using Iterator

package basicjavaprogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty1 {

	public static void main(String[] args) {
		
		Set <String> fruits = new HashSet(); //Set 1 - homogeneous values
		fruits.add("apple"); //Adding method
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple"); //duplicate - will not be accepted
		
		System.out.println("My Set 1 " +fruits); //does not follow the indexing
		
	Iterator it = fruits.iterator();
		while (it.hasNext())
			{
			System.out.println(it.next()); //forward iteration
			}
		
		Set s2 = new HashSet(); // Set 2 - heterogeneous values
		s2.add("dog"); //Adding method
		s2.add(1000);
		s2.add (false);
		s2.add('A');
		s2.add(8.2);
		
		System.out.println("My Set 2 " +s2); //does not follow the indexing
		
	Iterator it2 = s2.iterator();
		while (it2.hasNext())
		{
		System.out.println(it2.next()); //forward iteration
		}

		//Remove method
		fruits.remove("banana");
		System.out.println ("After removing banana from Set1 " + fruits);
		
		s2.removeAll(s2);
		System.out.println ("After removing all elements from Set2 " + s2);
		
		//Size of the sets
		System.out.println ("The Size of the Set 1 is: " + fruits.size());
		System.out.println ("The Size of the Set 2 is: " + s2.size());
		
	}

}
