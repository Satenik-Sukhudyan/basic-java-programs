//Assignment 78: WAP to check if 2 arrays are equal to each other at run time

package basicjavaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_CompareIfEqual {

	public static void main(String[] args) {
	Scanner s1 = new Scanner (System.in);

// I want both my arrays to be same size	
	System.out.println("Enter the size of your array 1: ");
	int[]array1 = new int [s1.nextInt()];
	int[]array2 = new int [array1.length];
	
//If we want to make both arrays different sizes we can write this part (line 18-19) and remove line 14
	/*System.out.println("Enter the size of your array 2: ");
	  int[]array2 = new int [s1.nextInt()];
	*/
	
	for (int i=0; i<=array1.length-1;i++ )
		
	{
		System.out.println("Enter the value of array 1 at index: " + i);
		array1[i] = s1.nextInt();
		System.out.println("Enter the value of array 2 at index: " + i);
		array2[i] = s1.nextInt();
		
	}
	
	System.out.println("1st Array is ->: "+ Arrays.toString(array1));
	System.out.println("2nd Array is ->: "+ Arrays.toString(array2));
	
	boolean b1 = Arrays.equals(array1, array2); //Now comparing both arrays
	
	if (b1==true)
	
	{
		System.out.println("Both arrays are equal");
	}
	else
		
	{
		System.out.println("The arrays are NOT equal");
	}
	
	}

}
