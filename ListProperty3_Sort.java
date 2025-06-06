//Assignment 98: WAP to sort List

package basicjavaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProperty3_Sort {

	public static void main(String[] args) {

List <Integer> l1 = new ArrayList <Integer> ();
		
		l1.add(10);
		l1.add(100);
		l1.add(52);
		l1.add(73);
		l1.add(3);
		
		System.out.println("Before Sorting " + l1); //follows indexing
		
		Collections.sort(l1);
		System.out.println("After Sorting " + l1);
	
	}

}
