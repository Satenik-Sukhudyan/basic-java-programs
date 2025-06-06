package basicjavaprogram;

public class StaticMethod_CallByName {
	
	// Static methods in the main method can be called by it's name

	public static void main(String[] args) 
	
	{
	System.out.println("I am the main method");
	add();
	}

	 static void add () 
	{	
	System.out.println ("I am the static method called in the main method by my name");
	}
	
	
}
