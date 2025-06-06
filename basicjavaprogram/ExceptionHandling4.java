package basicjavaprogram;
//Assignment 67: WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);  //Using Scanner class to take inputs at runtime
		System.out.println("Enter the size of array: "); 
		
		//1st Run - Enter invalid input: negative number to receive NegativeArraySizeException
		//2nd Run - Enter invalid input: any word instead of number
		
		
		try 
		{ 
		int [] number = new int[s1.nextInt()];
		number[0]=10; 
		number[1]=20; 
	    number[2]=55;
		}
		
		catch (NegativeArraySizeException w1)//Catch #1
		{
		System.out.println("The NegativeArraySizeException is handled");
		System.out.println("The size of array cannot be negative");
		}
        catch (InputMismatchException m1) //Catch #2
		{
		System.out.println("The InputMismatchException is handled");
		System.out.println("The size of array should be a number");
		}
	 
		}

}

