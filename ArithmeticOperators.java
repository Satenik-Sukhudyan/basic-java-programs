package basicjavaprogram;

public class ArithmeticOperators {

	static void add () //Addition
	
	/*If this static method is not 
	called in main method we will not get any output*/
	{
	int a = 100;
	int b = 200;
	int c = a+b;
	System.out.println(c);
	}
	
static void sub () //Subtraction
	
	{
	int a = 100;
	int b = 200;
	int c = b-a;
	System.out.println(c);
	}
	
 static void mul() //Multiplication

{
int a = 100;
int b = 200;
int c = a*b;
System.out.println(c);
}
 
 static void div () //Division
	
	{
	int a = 100;
	int b = 200;
	int c = b/a; 
	System.out.println(c);
	}

 static void mod () //Modulus -Press Shift+5 for modulus symbol
	
	{
	int a = 10;
	int b = 2;
	int c = a%b; 
	System.out.println(c);
	}
	
	public static void main(String[] args)
	
	{
		add();
		sub();
		mul();
		div();
		mod();
					
	}

}
