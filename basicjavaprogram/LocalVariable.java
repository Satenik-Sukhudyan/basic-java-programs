package basicjavaprogram;

//Assignment 18: WAP to declare a variable inside a static and non-static method. For local variable.

public class LocalVariable {
	
	void add()// non-static method
	{
		
	   int age = 15; //Declaration and Initialization (local variable name is 'age')
	   System.out.println(age); //Utilization
	
	}
	
	public static void sub() //static method
	
	{
		int year = 2025;//Declaration and Initialization (local variable name is 'year')
		System.out.println(year); //Utilization
		
	}

	public static void main(String[] args) {
		LocalVariable NS = new LocalVariable();
		NS.add();// Calling the non-static method
		
		sub(); //Calling the static method directly

	}

}
