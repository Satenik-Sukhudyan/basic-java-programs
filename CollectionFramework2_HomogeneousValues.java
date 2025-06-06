package basicjavaprogram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework2_HomogeneousValues {

	public static void main(String[] args) {
		
Collection <Integer> c1= new ArrayList <Integer>(); //upcasting (implicit), //Added <Integer> for homogenous values (int)
		
		c1.add(10);
		c1.add(5);
		c1.add(102);
		c1.add(60000);
		c1.add(54);
		
		
Collection <String> c2= new ArrayList <String>(); //upcasting (implicit), //Added <Integer> for homogenous values(String)
		
		c2.add("Test1");
		c2.add("Test2");
		c2.add("Test3");
		c2.add("Test4");
		c2.add("Test5");
		
// Similarly this can be done with any other dataype homogeneous values (Double, Float, Character...)		

	}

}
