//Write a program to find the frequency of each character in a given string.
package basicjavaprogram;


public class String_FindFrequencyOfeachCharacter {

	public static void main(String[] args) {
	
		String str = "hello";

		// Looping through each letter from 'a' to 'z'
		        for (char i = 'a' ; i <= 'z';  i++) {
		    int count = 0;
		            
		 // Looping through each character in the string   
		        for (int j = 0; j < str.length(); j++) {
		        if (str.charAt(j) == i) {
		            count++;
		                }
		            }
		            
		// If count > 0, print the character and its count
		            if (count > 0) {
		                System.out.println(i  + ":   " + count);
            }
        }
    }
}


