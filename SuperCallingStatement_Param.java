package basicjavaprogram;

//Assignment 44: WAP on super calling statement using parameterized super calling statement

class Teacher2 // Parent class (non-static)

{
	Teacher2(int a, double b) // Parent class Constructor
	
	{
	System.out.println ("I am Parent class constructor - parameterized");
	
	}
	
}


public class SuperCallingStatement_Param extends Teacher2 // Child Class (non-static) inheriting from the Parent class

{
	SuperCallingStatement_Param() // Child class constructor
	
	{
		
		super (1,32.5);
//Super calling statement implicit (written). It should always be implicit way only as it is for invoking the parameterized parent class constructor		
		
		System.out.println ("I am Child class constructor");
		
	}
	

	public static void main(String[] args) 
	
	{
		new SuperCallingStatement_Param (); 
	//Creating an object for calling the child class constructor

	}

}





