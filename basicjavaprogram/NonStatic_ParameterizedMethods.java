package basicjavaprogram;

public class NonStatic_ParameterizedMethods {

//Assignment 14 - WAP with combination of 4 non-static parameterized methods and try calling all of them
	
//method 1	
	void PrintName (String input) 
	{
		System.out.println("My name is Satenik");
	}
	
//method 2	
	void add (int a, int b)
	{
		System.out.println((a+b));
	}

	
//method 3	
	
	void WeatherCheck (double temp)
	
	{
	
	if (temp <=20)
	
	{
		System.out.println("It's cold");
	}

	else
	{
		System.out.println("It's warm");
	}
}
//method 4	
	void Greeting (String name)
	{
		System.out.println("Hello " + name);
	}

	
	
	public static void main(String[] args) {
		
//calling non-static method by creating an object with the help of their reference variables
		
		NonStatic_ParameterizedMethods W = new NonStatic_ParameterizedMethods ();
		W.PrintName("Satenik");
		W.add (5,5);
		W.WeatherCheck (18.5);
		W.Greeting ("Manish");
			

	}

}
