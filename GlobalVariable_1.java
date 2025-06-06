package basicjavaprogram;

public class GlobalVariable_1
{

   double pi =3.14; //global variable (non-static) - declaration with initialization
   static int noofdays2025 = 365; //global variable (static) - declaration with initialization
   static double bankbalance; //static global variable (double) declaration without initialization (see utilization below)
   static String name; //static global variable (String) declaration without initialization (see utilization below)
 
   	
   static void add()

   {
	   int a = 10; //local variable
   }
   
   void sub()
	
   {
	   int b =20; //local variable
   }
   
	public static void main(String[] args) 
	
	{
		double c = 1.2; //local variable
		
		System.out.println(bankbalance); 
		System.out.println(name); 
		
//global variable can be utilized without initialization. 
//The output is 0.0 because it has a default value in it (the default value for double is 0.0 and for String is null)

	}

}
