//Assignment 85: WAP on string functions using replace, replaceAll, substring, matches, repeat
//This is the "replace" part of the assignment - 2 examples

package basicjavaprogram;
public class StringFunction_replace {

	public static void main(String[] args) {
		
	//Example 1 - replace (char oldChar, char newChar) - replaces all occurences of a specific character
		String input = "Test";
		String output = input.replace('T' , 'B');
		System.out.println(output);
		
	//Example 2 - replace (CharSequence target, CharSequence replacement) - replaces all occurences of a substring
		String target = "summer";
		String replacement = "day";
		System.out.println(replacement);


	}

}
