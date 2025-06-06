//Assignment 77: WAP to accept the values of your array at run time

package basicjavaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_ScannerClass {

	public static void main(String[] args) {

		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the size of your Array");
	
	int number[]=new int[s1.nextInt()]; 
	
	for (int i=0; i<=number.length-1; i++) 	
	{
	System.out.println("Please enter the value of index position " + i);
	number[i]=s1.nextInt();
	}

	           System.out.println("Here is the array  " + Arrays.toString(number));
		
}
	
}
