//Assignment 79: WAP to copy one array into another array 

package basicjavaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_ScannerClass_CopyInto_another_Array {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of your array: ");
		
  //Array 1
  String[] output1 = new String [s.nextInt()];//The Array accepts String (can be any datatype). The size of an array is always Int
		for (int i=0; i<=output1.length-1; i++)
		{
		System.out.println("Enter the value at the index position: " + i);	
		output1[i]=s.next();
		}	
		
		System.out.println("This is your Input Array:- "+Arrays.toString(output1)); 
		s.close();
		
 //Array 2
 String[] output2 = new String [output1.length]; //the size of Array2(output2) should match the size of Array1 (output1)
 
//copy the value of Array1 and assign it to Array 2 using for loop
 for (int j=0; j<=output2.length -1; j++) //since the length is same for both we can also write j<=output1.length -1
	 
  {
     //NOTE: The Array1 should be on the right side and Array2 on the left for copying and assigning from Array1 to Array2
	 output2[j] =output1[j]; 
	 
  }	 
	 
        System.out.println("This is your output/copied Array: - "+ Arrays.toString(output2));
	 
 }
 
	}


