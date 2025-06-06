//Assignment 87: WAP on String Buffer using append, insert, delete, substring, reverse, Capacity, replace

package basicjavaprogram;
public class StringBufferExamples {

	public static void main(String[] args) {
	
		//APPEND
		StringBuffer a1 = new StringBuffer("I want to Go");
		a1.append(" home.");
		System.out.println(a1);
		
		//INSERT
		a1.insert(2, "really ");
		System.out.println(a1);
		
		//Capacity
		a1.capacity();
		System.out.println(a1.capacity()); //returns total allocated space for characters 
		
		//Length
		a1.length();
		System.out.println(a1.length()); //returns actual number of characters in the StringBuffer
		
		
		//DELETE
		a1.delete(0, 10); //Will delete from my new(previously modified String "I want to Go home."
		System.out.println(a1);
		
		//REPLACE
		a1.replace(3, 7, "eat"); //new string  = "Go home."
		System.out.println(a1);
		
		//SUBSTRING (with one param)
		a1.substring(3); // new String = "Go eat."
		System.out.println(a1);
//this will still print "Go eat." 
//Reason: substring() returns a String - The substring(3) extracts "eat." but because it was not stored in a variable, so a1 remains the same "Go eat."  
//To fix it we should store the result in a variable 'a2' but this will change it to String (no longer StringBuffer)!
		String a2 =a1.substring(3);
		System.out.println(a2);
		
		//SUBSTRING (with 2 params)
		String a3 = a1.substring (1,2);
		System.out.println(a3);
		
		//REVERSE
		System.out.println(a1.reverse());
		
		
		

	}

}
