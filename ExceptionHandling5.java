package basicjavaprogram;
//Assignment 65: WAP on finally keyword concept
import java.util.Scanner;

public class ExceptionHandling5 {

	public static void main(String[] args) {
	
			
			Scanner s1 = new Scanner (System.in);  
			System.out.println("Enter the size of array: "); 
			
		//Run the program and enter a wrong input - a negative number
			
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
			}
			finally
			{
			 System.out.println("Finally block executed. Exiting try-catch block"); //this message will always display
			}
					
	}

}
