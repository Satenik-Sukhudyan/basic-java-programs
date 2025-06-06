//Assignment 93: WAP on List concepts using its methods

package basicjavaprogram;

import java.util.ArrayList;
import java.util.List;

public class ListProperty1 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		//Add method - adding an object
		l1.add("apple");
		l1.add("pear");
		l1.add("orange");
		l1.add(1000); 
		l1.add(true);
		l1.add('S');
		
		//Add method - adding an object at a given index
		l1.add(0, "Satenik"); 
		l1.add(5, "TEST");
		
		System.out.println(l1);
		
		//AddAll method 
		List l2 = new ArrayList();
		l2.addAll(l1); // adding an entire l1 collection in l2 collection (all element of l1 to l2)
		l2.addAll(0, l1); //adding an entire l1 collection (all elements in l1) to l2 collection at a given index 0
		
		System.out.println(l2);
		
		//Remove method
		l2.remove(0);//removing an object from the specified index
		l2.remove("apple");//removing a particular object - since there are 2 'apples' in the list it removes only the 1st occurrence
		l2.removeAll(l2); //removes all elements from l2 (clears the list)
		l2.clear(); //also removes all elements from l2
		
	
		
		System.out.println(l2);
		
		
	
	}

}
