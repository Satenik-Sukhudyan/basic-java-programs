package basicjavaprogram;

public class Call_Static_And_NonStatic {
	
//Assignment 13 - WAP with combination of static and non-static methods and try calling both
	
		void NonStatic()
		{
			System.out.println("non-static method");
			
		}

		static void StaticMethod()
		{
			System.out.println("static method");
			
		}
		
	public static void main(String[] args) {
		//calling static method directly by its name (no object needed)
		
		StaticMethod();

		//calling non-static method by creating an object with the help of its reference variable
		
		Call_Static_And_NonStatic S = new Call_Static_And_NonStatic();
		S.NonStatic();
		
	}

}
