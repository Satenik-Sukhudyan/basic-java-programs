package basicjavaprogram;

//Assignment 39: WAP on Inheritance Concept

class Parentclass11 // Parent class
{
	static void add()
	
	{
		
		
		System.out.println("Static method from Parent");
	}
		
}

public class InheritanceConcept_StaticMethods extends Parentclass11// Child class established a connection with the parent class
{

	static void sub()
	
	{
	
		System.out.println("Static method from Child");
	}
	
	public static void main(String[] args) // main method should be present in Child class only
	{
		
		sub(); //Child class can utilize the method directly inside its own class
		Parentclass11.add(); //using parent's ClassName.staticMethodName() inside child class to call a parent's static method
	  
		
	}

}
