package basicjavaprogram;
//Assignment 52: WAP on Multi-Level Inheritance using Interface Concept

interface School_1 
{
	void science(); //Abstract method (by default abstract and public)
}

interface School_2 extends School_1 // Child Interface that extends School_1
{
	void art(); //Abstract method
}

//Child Class implements School 2 and indirectly inherits School_1
public class Inheritance_MultiLevel_with_Interface implements School_2 
{
	static void music()
	{
		System.out.println("Static method_child class");
	}
	
	void math() 
	{
		System.out.println("non static method_child class");
	}
		
	public static void main(String[] args) 
	{
	//created an object of the child class in order to call methods science() and art()
	Inheritance_MultiLevel_with_Interface B = new Inheritance_MultiLevel_with_Interface(); 
	
	B.science();
	B.art();
	B.math();
	music(); //direct call but can also be called with the help of B variable
		
	}

@Override //this line is not necessary but kept it for visual/reference purposes
	public void science() 
	{
		//developers will write the internal logic here (hidden -stays within an organization)
		System.out.println("School_1 internal logic");	
	}

@Override //this line is not necessary but kept it for visual/reference purposes
	public void art() 
	{
		//developers will write the internal logic here (hidden -stays within an organization)
		System.out.println("School_2 internal logic");
	}

}
