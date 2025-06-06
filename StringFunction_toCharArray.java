//Assignment 74: WAP on String Function using tocharArray concept

package basicjavaprogram;

import java.util.Arrays;

public class StringFunction_toCharArray {

	public static void main(String[] args) {
		
String input = "Test"; //Note: a sentence can also be used here such as "Test Test test" but just in the output spaces will not have any character
char[] C = input.toCharArray();//'toCharArray' String function is used to convert String into a char array (char[])
		
		//Loop through char array  - no need to use the For loop here if I am using Arrays.toString() method in line 21 
		//for (int i=0; i<input.length(); i++ )// instead of "i<input.length()" this condition will also work "i<=input.length()-1"  
			
		{
			//System.out.println(C[i]); //printing each character on a new line - better not to use this way
			
		}
		System.out.println(Arrays.toString(C));//printing character values in an array format using the predefined method
	}	

}
