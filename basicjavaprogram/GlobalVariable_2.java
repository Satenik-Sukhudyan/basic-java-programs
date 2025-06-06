
package basicjavaprogram;

//Assignment 22: WAP for static and non-static global variables and utilize them in both static and non-static methods

public class GlobalVariable_2 
{

   double pi =3.14; //global variable (non-static)
   static int noofdays2025 = 365; //global variable (static)
   
   
   static void add()

   {
	  
	   System.out.println("Static variable utilized by static method: " + noofdays2025);
	   GlobalVariable_2 g = new GlobalVariable_2(); // creating an object to access the non static variable
	   System.out.println("Non- static variable utilized by static method: " +g.pi);
   }
   
   void sub()
	
   {
	   System.out.println("Static variable utilized by non-static method: " + noofdays2025 );
	   System.out.println("Non-static variable utilized by non-static method: " + pi); 
   }
   
	public static void main(String[] args) 
	
	{
	
		add(); //calling the static method
		//Creating an object to call the non-static method
		GlobalVariable_2 g = new GlobalVariable_2();
		g.sub();
		

	}

}
