//Assignment 71: WAP to reverse a string

package basicjavaprogram;

public class ForLoop_ReverseString_NotTheBestVersion {

	public static void main(String[] args) {
		
		String input = "mouse";
		String reversed = "";
		
		for (int i=4; i>=0; i--) //Loop from last index (4) to first (0)
		
		{
			reversed += input.charAt(i); //Appending each character to reversed using +=(concatenation)
		}

		System.out.println(reversed);
	}

}
