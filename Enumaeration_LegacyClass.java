//Assignment 101: WAP on Enumeration

package basicjavaprogram;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaeration_LegacyClass {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement(1100);
		v.addElement("sat");
		v.addElement(1.25);
		v.addElement('K');
		
		Enumeration e = v.elements();
		while (e.hasMoreElements())
			
		{
			System.out.println(e.nextElement());
		}
		

	}

}
