package basicjavaprogram;

import java.util.Scanner;

public class ScannerClass_PredefinedClass
{

	public static void main(String[] args) 
	
	{
	
		Scanner s1=new Scanner(System.in); //constructor

		//First example with nextInt
		System.out.println("Please enter a value for X");
		int a =  s1.nextInt();
		
		System.out.println("Please enter a value for Y");
		int b =  s1.nextInt();
		
		int sum = (a+b);
		System.out.println("THE SUM OF X+Y IS: "  + sum);
		
		//s1.close(); //highly recommended to close the scanner class
		
		
		
// 1. creating an object of a scanner class
// 2. importing it (java.util.Scanner)
// 3. and then using System.in (a parameter for scanner) to accept human input at the run time	
// The reason we are passing the parameters so we can call its constructor
// After running this in the console we will see a cursor blinking (waiting for human input at runtime)	
// After we provide a value those will be stored in variables a and b
// Then we print out the result (a+b) which value will be stored in sum	variable	
		
		//Second example with String
       	System.out.println("What is your first name?");
       	String firstname  = s1.next();
       	
       	
       	System.out.println("What is your last name?");
       	String lastname = s1.next();
       	
       	System.out.println("How old are you ?");
		int age =  s1.nextInt();
       	
       	System.out.println ("Bye!");
       	
       	s1.close();
       	
       	
       	
       	
		
	}

}
