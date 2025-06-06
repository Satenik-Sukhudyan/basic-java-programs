//Assignment 76: Find out the average of all the numbers present in your array
//Formula:  Average = Sum of all values/total number of values

package basicjavaprogram;

import java.util.Scanner;

public class Array_FindAverageValue {

	public static void main(String[] args) {
		
		double sum =0; // Initialize sum to 0
		double average; //Global variable to store the average value
		Scanner s1= new Scanner(System.in); //Scanner to take user input
		
		System.out.println("Please enter the size of your Array : ");
	    double[] array=new double[s1.nextInt()]; //Declare array with given size (size should be in Int)
	    for (int i=0; i<=array.length-1; i++) //Loop to take array values as input
	    	
	    {
	    	System.out.println("Please enter the value of array1 at index: " +i);
	    	array[i] = s1.nextDouble(); //Accepting values from the user (decimal or int - both acceptable with Double)
	    	sum=sum+array[i];// Adding values to sum - breakdown for easy understanding:
	    	/* 
		     i=0, sum=0+array[0]
		 	 i=1, sum=array[0]+[1]
		 	 i=2, sum=array[0]+[1]+array[2]
		     i=2, sum=array[0]+[1]+array[2]+ array[3] 	 
		     */	
	    }
	    
	    System.out.println("The sum of values in your array is: " +sum);
	    average=sum/array.length; //Calculate average
	    System.out.println("The average of the array is: " +average);
	    s1.close();
	
	}

}
