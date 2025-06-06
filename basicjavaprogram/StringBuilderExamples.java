//Assignment 88: WAP on String Builder using Append, insert, delete, substring, reverse, Capacity, replace

package basicjavaprogram;

public class StringBuilderExamples {
	
	public static void main(String[] args) {
		
		StringBuilder a1 = new StringBuilder("I want to learn");
		
		//APPEND
		a1.append(" coding.");
		System.out.println(a1);
		
		//INSERT
		a1.insert(2, "really ");
		System.out.println(a1);
		
		//Capacity
		a1.capacity();
		System.out.println(a1.capacity()); //returns total allocated space for characters 
		//Capacity = 16(initial capacity) + Length of Initial String (16 + 15 characters in the initial string "I want to learn" = 31)
		
		//Length
		a1.length();
		System.out.println(a1.length()); //returns actual number of characters in the StringBuilder
		// Number of characters in the modified string "I really want to learn coding." = 30
		
		
		//DELETE
		a1.delete(0, 13); //Removes "I really want" - Output "to learn coding."
		System.out.println(a1);
		
		//REPLACE
		a1.replace(3, 9, " start"); // Output "to start coding."
		System.out.println(a1);
		
		//SUBSTRING (with one param)
		a1.substring(3); 
		System.out.println(a1);
//this still prints "to start coding." because substring() does not modify StringBuilder
//To fix it we should store the result in a variable 'a2' but this will change it to String (no longer StringBuilder)!
		String a2 =a1.substring(3); //storing substring in a variable
		System.out.println(a2); //Output: "start coding."
		
		//SUBSTRING (with 2 params)
		String a3 = a1.substring (1,2); //Extracts "t" (character at index 1) - Note: there is a space at index 0
		System.out.println(a3);
		
		//REVERSE
		System.out.println(a1.reverse()); //Output: reversed string
				

	}

}

	


