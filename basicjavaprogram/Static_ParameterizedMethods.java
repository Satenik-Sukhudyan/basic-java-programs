package basicjavaprogram;
//WAP with combination of 3 static parameterized methods and try calling all of them

public class Static_ParameterizedMethods {
	
	//method 1	
	
	static void Greeting (String name)
	{
		System.out.println(name);
	}
	
	
	//method 2
	static void Multiply (int a, int b)
	{
		System.out.println(a*b);
	}
	
	//method 3
	static void checkNumbers (int C)
	{
	
	if (C > 0) 
	
		
	{
		System.out.println(C +  " is positive number");
	}
	
	else
		
	{
		System.out.println(C + "is negative number");
	}	
	
}

	public static void main(String[] args) {
		//Calling Static parameterized methods directly 
		Greeting ("Hello!!");
		Multiply (5,5);
		checkNumbers (-5);
		
		
		

	}

}
