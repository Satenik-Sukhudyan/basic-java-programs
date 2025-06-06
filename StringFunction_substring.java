//Assignment 85: WAP on string functions using replace, replaceAll, substring, matches, repeat
//This is the "substring" part of the assignment - 2 examples

package basicjavaprogram;
public class StringFunction_substring {

	public static void main(String[] args) {
		
	//Example 1 - substring (with single parameter) - extracts a substring starting from the specified index and returns the rest of the string	
		String input1 = "Gro Tech Minds";
		String output1 = input1.substring(9);
		System.out.println(output1);

	//Example 2 - substring (with double parameters) - extracts a portion of the string from the specified start index(inclusive) to the end index (exclusive)	
		String input2 = "Gro Tech Minds";
		String output2 = input2.substring(0, 3);
		System.out.println(output2);
		
		
		
	}

}
