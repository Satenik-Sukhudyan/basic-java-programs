package basicjavaprogram;

//Assignment 42: WAP on Hierarchical Level Inheritance

class Father {
	
	static void father() {
		
		System.out.println("father");
		
	}
}

class Child1 extends Father {
	static void one()
	
	{
		System.out.println("child 1");
	}
	
}

class Child2 extends Father {
	static void two()
	
	{
		System.out.println("child 2");
	}
	
}

class Child3 extends Father {
	static void three()
	
	{
		System.out.println("child 3");
	}
	
}

public class Inheritance_Hierarchical extends Father {
	
	static void four()
	
	{
	System.out.println("child 4");
	}

	public static void main(String[] args) {
		
		// calling the static methods using class name
		
		
		Child1.one();
		father();
		
		Child2.two();
		father();
		
		Child3.three();
		father();
		
		four();
		father();
		
	}

}
