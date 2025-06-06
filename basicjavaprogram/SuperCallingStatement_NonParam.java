package basicjavaprogram;

//Assignment 43: WAP on super calling statement using non-parameterized super calling statement

class Teacher //Parent class (non-static)

{
	Teacher() // Parent class Constructor
	
	{
	System.out.println ("I am parent class constructor - non param");
	
	}
	
}


public class SuperCallingStatement_NonParam extends Teacher // Child Class (non-static) inheriting from the Parent class

{
	SuperCallingStatement_NonParam () // Child class constructor
	
	{
	
		super ();
//Super calling statement (explicit way).It could've been implicit as well (not written) as it is for non-param parent class constructor		
		
		System.out.println ("I am child class constructor");
		
	}
	

	public static void main(String[] args) 
	
	{
		new SuperCallingStatement_NonParam (); 
		//Creating an object for calling the child class constructor

	}

}
