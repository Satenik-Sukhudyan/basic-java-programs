package basicjavaprogram;

//If 'continue' keyword is added to the for loop program that is for printing 1-5 then 4(in this case) will be skipped 

public class ForLoop_With_ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i = 1; i<=5; i++)
			
		{
			if (i==4)
				
			{
				System.out.println("Let's skip " + i); // this is optional 
				continue;
			
			}
			
			System.out.println(i);
		}

	}

}
