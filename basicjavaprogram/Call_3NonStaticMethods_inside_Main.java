package basicjavaprogram;

public class Call_3NonStaticMethods_inside_Main {

		
//non static method 1
		void add()
		{
			System.out.println("non static method 1");
			
		}
		
//non static method 2
		
		void div()
		{
			System.out.println("non static method 2");
			
		}
		
//non static method 3
		
		void sub()
		{
		 System.out.println("non static method 3");
					
		}		
		
		
//Main Method
		public static void main(String[] args) 
		{
		
			System.out.println("Main");
			
// Calling non static methods inside main by creating objects 
			Call_3NonStaticMethods_inside_Main N = new Call_3NonStaticMethods_inside_Main();
			N.add();
			N.div();
			N.sub();
			
		
	

	}

}
