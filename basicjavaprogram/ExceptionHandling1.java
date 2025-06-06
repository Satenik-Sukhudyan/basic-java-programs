package basicjavaprogram;
//Assignment 62: WAP on Exception handling

public class ExceptionHandling1 {
	
	public static void main(String[] args) {
	
	try // putting the line of code below in the 'try block as the exception is coming from there
	{
		int a =1/0; //This line will throw ArithmeticException(division by zero)
		
		// If the above line is valid (e.g 1/1) then this line would execute
		System.out.println(a); 
	}
	
	catch (ArithmeticException e)//This block handles the ArithmeticException
	
	{
		System.out.println("The ArithmeticException exception is handled");
	}
	
	
	}

}
