package basicjavaprogram;

public class ExceptionHandling6_NestedTryCatch {
	//Assignment 63: WAP on Exception handling using nested try catch keywords

	public static void main(String[] args) {
		
		try
		{
			
			   try  
			   {
				   int result = 1/0; //This will throw ArithmeticException
				   System.out.println(result);   
			   }
			   
			   catch (ArithmeticException e) 
			   {
				   System.out.println ("Nested try/catch - 1 cannot be divided by 0");
			   }
		
		int[] numbers = {1,2,3};
		System.out.println(numbers[5]);//This will throw ArrayIndexOutOfBoundsException
		
		}
		
		catch (ArrayIndexOutOfBoundsException a)
		
		{
			System.out.println ("Main try/catch - Index is out of bounds");
		}
			   
		// Program will continue after handling exceptions
		
		}

	}


