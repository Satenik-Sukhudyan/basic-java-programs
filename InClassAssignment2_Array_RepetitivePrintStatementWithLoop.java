/*
 
 System.out.println(name[0] + " roll no is -> "+rollno[0]);
 System.out.println(name[1] + " roll no is -> "+rollno[1]);
 System.out.println(name[2] + " roll no is -> "+rollno[2]);

Write the above line in single line using for loop

 */


package basicjavaprogram;

import java.util.Arrays;

public class InClassAssignment2_Array_RepetitivePrintStatementWithLoop {

	public static void main(String[] args) {
		
		String[]name = new String[3];
		
	    name[0] = "Anna";
	    name[1] = "Mary";
	    name[2] =  "Bob";
	    
	    System.out.println(Arrays.toString(name)); //String in Array format
	    
	    
	    int [] rollno = new int [3];
	    
	    rollno[0] = 100;
	    rollno[1] = 101;
	    rollno[2] = 102;
	    
	    System.out.println(Arrays.toString(rollno)); //Int in Array format
	    
	    
	    for (int i=0; i< rollno.length; i++)
	    	
	    {
	    System.out.println(name [i] + "'s rollno is: " + rollno [i]);
	    }
	    
		}
				
	}

	


