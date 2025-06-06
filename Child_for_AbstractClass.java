package basicjavaprogram;
//Assignment 49 (2): WAP on Abstract Class with both Abstract and Concrete methods

abstract class AbstractParent// abstract class (AC)- Parent

{
	abstract void AM();//abstract method 
	
    void CM()//concrete method 
	
	{
    	   System.out.println("This is the concrete method in the Abstract class");
	}
	

}

public class Child_for_AbstractClass extends AbstractParent//concrete class (C) - Child class

{ 
	public static void main(String[] args)
	
	{
		
		Child_for_AbstractClass J = new Child_for_AbstractClass (); //creating object of the child class
		
		J.AM();//calling an overridden abstract class in Child class
		
		J.CM();// calling the inherited concrete method from the abstract parent class
		
	}

    @Override //Override annotation
	void AM()//Overriding and implementing the abstract class
	
	{
System.out.println("This is the abstract method in the Abstract class with added implementation after overriding ");
		
	}

}
