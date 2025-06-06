package basicjavaprogram;
 

//WAP on logical operators with AND, OR, AND-NOT and Or-not

public class LogicalOperatorsAndOrNot {

	public static void main(String[] args) {
		int a=5;
		int b=10;		
		
		
		//1. Logical AND (&&)
		if (a==b && b==10)
		{
			System.out.println("123"); 
		}
		// this will not be executed because both C1 AND C2 are false (AND operator: C1=F && C2=F = FALSE)
		
		
		//2. Logical OR (||)
		if (a<=b || b==20)
		{
				System.out.println("123"); 
		}			
		//this will be executed because one of the conditions (C1) is true (OR operator: C1=T; C2=F = TRUE)
		
		
		//3. Logical 'OR with NOT'
		if (!(a<=b || b==10))
		{
			System.out.println("123"); 
	    }
		// this will not be executed because the input condition (C1 || C2) is true
		
		
		//3. Logical 'AND with NOT'
		if (!(a>=b && b>=10))
		{
		 System.out.println("123"); 
		}
		// this will be executed because the input condition (C1 AND C2) is false
		
		
	}

}
