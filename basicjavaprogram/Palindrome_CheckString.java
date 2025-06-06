package basicjavaprogram;
//Assignment 72: WAP to check if the given string is a Palindrome?

public class Palindrome_CheckString {

	public static void main(String[] args) {
	
		String input = "mom";
		String output = "";
		
		for (int i=input.length()-1; i>=0; i--) 
	    
		
		{
			char a = input.charAt(i);
			output = output+a;
		}

		System.out.println("The given String input is: "+output);
		
	if (input.equals(output))
		
		System.out.println("The input String is a Palindrome!");

	else 
		
		System.out.println("The input String is NOT a Palindrome!");
	}
}