package basicjavaprogram;
//Assignment 62: WAP on Exception handling

import java.util.Scanner;
//Assignment 62: WAP on Exception handling

public class ExceptionHandling3 {

	public static void main(String[] args) {

	Scanner s1 = new Scanner (System.in);  //Using Scanner class to take inputs at runtime
	System.out.println("Enter the size of array: "); // Enter a negative number to receive NegativeArraySizeException
	
//Array program. Array size of 3

//the entire code below should be placed in try block, otherwise 'number' will not be recognized if we put only line 17 in it
	try 
	{ 
				int [] number = new int[s1.nextInt()];
		         number[0]=10; 
		         number[1]=20; 
		         number[2]=55;
	}
	
	catch (NegativeArraySizeException w1)
	
	{
		System.out.println("The NegativeArraySizeException is handled");
		System.out.println("The size of array cannot be negative");
		Scanner s2 = new Scanner (System.in); // Trying again after exception handling
		System.out.println ("Enter the size of array again: "); //Enter a positive number -lenght of your array 3
		
		int [] number = new int[s2.nextInt()];
        number[0]=10; 
        number[1]=20; 
        number[2]=55;
	}
			
	}
}
