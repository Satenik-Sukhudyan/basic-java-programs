package basicjavaprogram;
//Assignment 71: WAP to reverse a string

public class ForLoop_ReverseString_BestVersion {

	public static void main(String[] args) {
	
		String input = "mouse"; //input string to reverse
		String output = ""; //empty string to store the reversed result
		
		for (int i=input.length()-1; i>=0; i--) //Loop from the last character to the first
	  //for (int i=4; i>=0; i--) //Loop from last index (4) to first (0) - This will also work
		
		{
			char a = input.charAt(i); // Get the character at index i
			output = output + a; //This builds the reversed string one character at a time
		}

		System.out.println("The reversed output of the given input is: " + output); //Print the final reversed string
	}

}
