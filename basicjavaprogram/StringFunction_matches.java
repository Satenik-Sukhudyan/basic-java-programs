//Assignment 85: WAP on string functions using replace, replaceAll, substring, matches, repeat
//This is the "matches" part of the assignment - 4 examples

package basicjavaprogram;
public class StringFunction_matches {

	public static void main(String[] args) {
		
		String input = "Test Test";
		
		//Example 1 - check if the given String consists of 9 characters
		
		boolean b1 = input.matches("........."); //here each dot represents one character
		System.out.println(b1);
			
	   	//Example 2 - check if the string ends with t
		
		 boolean b2 = input.matches("(.*)T"); //(.*)means multi character, we don't care about how many characters before t, just check if ends with t
		 System.out.println(b2);
		 
		 //Example 3 - check if the string starts with T
		 boolean b3 = input.matches("(.*)T");
		 System.out.println(b2);
		 
		 //Example 4 - check if the given input has 'est' in it
		 boolean b4 = input.matches("(.*)est(.*)");
		 System.out.println(b4);
		 //In this example with the regex function we want to check if 'est' is present either in front, middle or at the end
		 
	}
}
