package basicjavaprogram;

//Assignment 41: WAP on Multi Level Inheritance (example with non-static methods)

class Grandparent_A //Super most (grandparent) class
{
	void mul()
	
	{
		int a = 2;
		int b = 3;
		int sum = a*b;
		
		System.out.println("I am the (mul)non-static method of a grandparent class " + sum);
	}
		
}

class Parent_A extends Grandparent_A //Super(parent)class extending granparen't class
{
	void add()
	
	{
		int a = 2;
		int b = 3;
		int sum = a+b;
		
		System.out.println("I am the (add) non-static method of a parent class " + sum);
	}
		
}

public class Inheritance_MultiLevel_NonStaticMethods extends Parent_A//Subclass (child) extending parent's class
{

   void sub()
	
	{
		int a = 10;
		int b = 3;
		int sum = a-b;
		
		System.out.println("I am the 'sub' non-static method of a child class " + sum);
	}
	
	    public static void main(String[] args) 
	  {
	   //Child class can utilize the non-static method inside its own class
	   Inheritance_MultiLevel_NonStaticMethods CH = new Inheritance_MultiLevel_NonStaticMethods();
	   CH.sub ();
	    		   	
	   //Child class utilizes the non-static method of the parent's class with the same object
	   CH.add();
	   		      
	  //Child class utilizes the non-static method of the grandparent's class with the same object
	   CH.mul();
			
	  }

}
