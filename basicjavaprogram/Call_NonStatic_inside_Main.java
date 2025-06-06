package basicjavaprogram;

public class Call_NonStatic_inside_Main {

	
//non static method
		void add()
		{
			System.out.println("non static");
			
		}
		
//Main method
		public static void main(String[] args) 
		{
		
			System.out.println("Main");
			
// creating an object which is required when calling non-static method to static
			Call_NonStatic_inside_Main N = new Call_NonStatic_inside_Main();
			N.add();
			
		}
}
	
