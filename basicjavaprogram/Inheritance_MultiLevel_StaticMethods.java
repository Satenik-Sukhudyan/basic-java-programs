package basicjavaprogram;
//Assignment 41: WAP on MultiLevel Inheritance (example with Static methods)

class Grandparent //Super most (grandparent) class
{
	static void mul()	
	{
		
		System.out.println("I am the (mul)static method of a grandparent class " );
	}
		
}

class Parent extends Grandparent //Super(parent)class extending granparen't class
{
	static void add()
	{
		
		System.out.println("I am the (add)static method of a parent class " );
	}
		
}


public class Inheritance_MultiLevel_StaticMethods extends Parent//Subclass (child) extending parent's class
{

   static void sub()
	{
	
		System.out.println("I am the 'sub' static method of a child class ");
	}
	
	    public static void main(String[] args) 
	  {
		sub(); //Child class can call the method inside its own class directly by it's name
		Parent.add(); //Child class utilizes the static method of the parent's class using it's class name
		Grandparent.mul(); //Child class utilizes the static method of the grandparent's class using it's class name
			
	  }

}
