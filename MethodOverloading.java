package basicjavaprogram;

// Assignment 16: WAP for Method overloading for static and non-static method

public class MethodOverloading 

{
	static void add ()
	{
		System.out.println("1");
	}
	
    static void add (int a)
	{
    	System.out.println(a+5);
	}
	

    static void add (int a, double b)	
   	{
    	System.out.println(a+b+1);
   	}
    
    
    void add (double b,int c)
	{
    	System.out.println(b+c+4);
	}  
    
    void add (int a, int b, double c)
	{
    	System.out.println(a+5+c);
	}  
    
    void add (double a, double b, double c)
	{
    	System.out.println(a+b+1);
	}  
    
public static void main(String[] args)
	
	{
		//Calling Static methods
		add();
		add(25);
		add(3, 2.4);
		
		//Calling Non-static methods
		MethodOverloading M1 = new MethodOverloading();
		M1.add(3.3, 1);
		M1.add(2, 5, 1.2);
		M1.add(1.2, 24.1, 200.1);
		
		
	}

}
