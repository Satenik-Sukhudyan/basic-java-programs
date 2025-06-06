package basicjavaprogram;

//Assignment 23: WAP to update static and non-static global variable

public class GlobalVariable_3 {

	//static global variables
	static String name = "Manual Tesing";
	static int salary = 100;
	
	//non-static global variable
	
	double pi = 3.14;
	
	public static void main(String[] args) 
	
	{
		System.out.println("Initial name: " + name);
		name ="Automation Testing"; //updating the static variable directly in main method
		System.out.println("Updated name: " + name);
		
		
		System.out.println("Initial salary: " + salary);
		salary = 10000; //updating the static variable directly in main method
		System.out.println("Updated salary: " + salary);
		
		
		GlobalVariable_3 g = new GlobalVariable_3(); //first creating an object (needed to access the non-static variable)
		System.out.println("Initial pi: " + g.pi);
		g.pi = 5.14; //Updating the non-static global variable
		System.out.println("Updated pi: " + g.pi);		
		
		
		

	}

}
