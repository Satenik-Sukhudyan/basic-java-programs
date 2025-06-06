package basicjavaprogram;

public class ComparisonOperators {
	
	public static void main(String[] args) 
	
	{
		//'If' block
		int a=10;
		if (a>6)	
		{
			System.out.println("Yes,10>6");
		}
		
		//'if else' block
		int age=25;
		if (age>=18)
		{
			System.out.println("Can Vote");
		}	
		else		
		{
			System.out.println("Can't vote");
		}
		
		//'if else if' block - The first block that becomes TRUE will be executed only
		int d =10;
		int e =20;
				
		if(d>e)
		{
			System.out.println("Hello");	
		}	
		
		else if(d<e) //this 'else if' can be many		
		{
			System.out.println("Bye");
		}
		
		else
		{
			System.out.println("End");
		}
					
	}

}
