package basicjavaprogram;

public class MainMethodOverloading {

	public static void main() 
	{
		
	}


		public void main(int a, int b) 
		{
			
		}
		
		
			public static void main(String[] args) //execution will start from this as its the heart of the program
			{
				//Calling the main methods
				main();
				MainMethodOverloading m1 =new MainMethodOverloading ();
				m1.main(1, 99);
				
			}
	
}
