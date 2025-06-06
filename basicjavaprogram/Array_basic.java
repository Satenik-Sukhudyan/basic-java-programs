//Assignment 73: WAP on basic concepts of Array

package basicjavaprogram;
public class Array_basic {

	public static void main(String[] args) {
	
			
			//declaring and initializing the arrays 
		
		double[] price = new double[3]; //3 is the size of the double array - means the array variable can store 3 decimal values in double dataype
	        price[0]=1.9; //value at the index position 0
	        price[1]=2.4; //value at the index position 1
	        price[2]=5.5; //value at the index position 2
	       
	        
	     String[] fruit = new String[3];//3 is the size of the String array - means the variable 'fuits' can store 3 strings in String datatype
	       fruit[0]="Apples"; //value at the index position 0
	       fruit[1]="Oranges"; //value at the index position 1
	       fruit[2]="Bananas"; //value at the index position 2
	   
	       
	       //System.out.println(fruit[0] + " costs " + price[0]); This is for the individual item - Apples
	       
	//To print all fruits and their prices using for loop
	       
	       for (int i =0; i<fruit.length; i++)
	       {
	    	   System.out.println(fruit[i] + " 1kg costs " + price[i]); // for each valid i (in both fruit and price) the loop executes
	       }
	        
	        
		}

	}


