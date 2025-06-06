package basicjavaprogram;
//Assignment 62: WAP on Exception handling
//Assignment 82: WAP on arrayindexoutofbounds exception with a try catch

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		double[] price = new double[3];
         price[0]=1.9; 
         price[1]=2.4; 
         price[2]=5.5; 
         
         try 
         {
         price [3]= 6.2; //This line will throw ArrayIndexOutOfBoundsException so putting it in the 'try' block
         }
         
         catch (ArrayIndexOutOfBoundsException e)
         
        {
        	System.out.println("The ArrayIndexOutOfBoundsException is handled");
         }
        
        String[] fruit = new String[3];
	     fruit[0]="Apples"; 
	     fruit[1]="Oranges"; 
	     fruit[2]="Bananas"; 
	   
	       
	       System.out.println(fruit[0] + " costs " + price[0]);
	       System.out.println(fruit[1] + " costs " + price[1]);
	       System.out.println(fruit[1] + " costs " + price[2]);
	}

}
