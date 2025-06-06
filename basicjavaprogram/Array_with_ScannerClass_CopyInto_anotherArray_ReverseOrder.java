//Assignment 80: WAP to copy one array into another array in reverse order

package basicjavaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_ScannerClass_CopyInto_anotherArray_ReverseOrder {

public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the size of your array: ");
		

int input[] = new int [3]; //Array1 (input)
		    input [0]=11;
		    input [1]=22; 
		    input [2]=33;
 
 
 int[]output = new int[input .length]; //Array2 (output - with reversed values)
 
 
 for (int i =0,j=input.length -1; i<=input.length-1;i++, j--) 
/*
1.We added j=input.length -1 for the reverse (output)
- instead of j=input.length -1 we could also write j=2 (but not a prefered way to hard code it) 
- in reverse it starts from position 2 and not 0 
2.we also added j-- because for reverse it goes in backwards direction so it should decrement	 
*/	 
	 
	 
 {
	 output[j] = input [i];
 }

 System.out.println("Input Array is: " + Arrays.toString(input));
 System.out.println("Output Array is: " + Arrays.toString(output));
	}

}