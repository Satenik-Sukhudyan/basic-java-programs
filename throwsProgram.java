package basicjavaprogram;
//Assignment 64: WAP on throws keyword concept

import java.util.InputMismatchException;

public class throwsProgram {

	//Declaring that main() might throw two exceptions
	public static void main(String[] args) throws NullPointerException,InputMismatchException 
	
	{
		if (1<10)//sample condition to demonstrate throwing exceptions
		 {		
		  throw new NullPointerException("Sorry, the cell is empty"); //if condition is true, throw NullPointerException with custom message
		 }
		else
		{		
		 throw new InputMismatchException("Sorry, the input is not what is expected"); //if condition is false, throw InputMismatchException with custom message
		}	

	}

}
