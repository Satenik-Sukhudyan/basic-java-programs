package basicjavaprogram;

public class Nested_IF_ELSE_block {

	public static void main(String[] args) {
		
			int a=5;
			int b=25;
			int c=50;
			
		if (a>b)//C0 "5>25" is FALSE so C0 will not be executed	and C1, C2 will be ignored. 
			
		{
			 if (a>c)//C1 "5>50"
				 
			 {
				
			   {
				System.out.println("1");	
			    }
			
			
			            if (c<a) //C2 "50<5"  
			        	   
			           {
			         {
			   			System.out.println("2");
			   		 }
			           }
			           
			           else //C2 else
			   			
			   		{
			   			System.out.println("3");
			   		}
			           
			     }
			
			 else //C1 else
				
			{
				System.out.println("4");
			}
			
			 }
				
		else  // C0 else - Since the C0, C1, C2 were FALSE this line only will be executed and the output will be 5
			
		{
			System.out.println("5");
		
		}

		

	}

}
