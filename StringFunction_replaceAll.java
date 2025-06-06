//Assignment 85: WAP on string functions using replace, replaceAll, substring, matches, repeat
//This is the "replaceAll" part of the assignment - 2 examples

package basicjavaprogram;
public class StringFunction_replaceAll {

	public static void main(String[] args) {
		
	//Example 1 - replace all numeric characters with nothing
		
		String input1 = "101Test222";
		String output1 = input1.replaceAll("[0-9]", " ");
	    System.out.println(output1);
	    
   //Example 2 - replace all lower letters with nothing    
	    String input2 = "Gro Tech Minds";
		String output2 = input2.replaceAll("[a-z]", " ");
	    System.out.println(output2);

	}

}
