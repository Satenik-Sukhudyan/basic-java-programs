//Assignment 84: WAP to count the number of alphabets, numeric letters, spaces and special characters used in the given String     

package basicjavaprogram;

import java.util.Arrays;

public class ArrayStringCountAbcNumbers_SpacesSpchar {

	//Declaring global variables
	static int countofalpha=0;
	static int countofnumeric=0;
	static int countofspace=0;
	public static void main(String[] args) {
		
		
		String input = "I can do it 100% !"; //A=10, Spaces =5, N=1, SC=2
		char[] array = input.toCharArray();//Converting the string into character array
		System.out.println("Input Array is:-> "+Arrays.toString(array));//Printing the character array
		for(int i=0; i<=array.length-1;i++) //Looping through the character array - iterates through each character in array
	{
		boolean b1 = Character.isAlphabetic(array[i]); //Checking if Character is letter (alphabet)
		if (b1==true)
		{
			countofalpha++; //if true, increments countofalpha
		}
		
		boolean b2 = Character.isDigit(array[i]); //Checking if Character is number (digit)
		if (b2==true)
		{
			countofnumeric++; //if true, increments countofnumeric
		}
		
        boolean b3 = Character.isWhitespace(array[i]); //Checking if Character is a space (' ')
        if (b3==true)
		{
			countofspace++; //if true, increments countofspace
		}
         
	}
	//Printing outside the 'for loop' to avoid multiple prints - Prints the counts for letters, numbers, spaces and special characters
		System.out.println("Count of letters in the given Array is: "+countofalpha);
		System.out.println("Count of numbers in the given Array is: "+countofnumeric);
		System.out.println("Count of spaces in the given Array is: "+countofspace);
		
    //Calculating Special Characters
   //Declaring a local varable for countofspecialcharacter	
  //Since special characters are not letters, numbers, or spaces, their count is found by subtracting(letters+numbers_spaces) from the total string length
		int countofspecialcharacter = input.length()-(countofalpha+countofnumeric+countofspace);
        System.out.println("Count of special characters in the given Array is: "+countofspecialcharacter);
	}

}
