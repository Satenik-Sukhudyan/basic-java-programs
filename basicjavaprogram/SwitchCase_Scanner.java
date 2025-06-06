package basicjavaprogram;

import java.util.Scanner;

public class SwitchCase_Scanner {

	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner (System.in); // This is optional but we can also use Scanner class to run the program with Human Input
		System.out.println("Enter which case you want to execute");
		int input = s1.nextInt();
		
		s1.close();
		
		switch (input) // We can type any case number in () depend which cas we want to be executed, or if we use Scanner we need to put 'input' in()
	      
	    {		  
	      case 1: 
	    	  
			  System.out.println("Chrome browser Automation");
			  break;  //breaks are optional but highly recommended
			  
	      case 2:
	    	  
	    	  System.out.println("Mozilla browser Automation");
	    	  break;  //breaks are optional but highly recommended
	      
	      case 3:
	    	 
	    	  System.out.println("Edge browser Automation");
	          break;  //breaks are optional but highly recommended
	      
	      case 4:
	    	  System.out.println("Safari browser Automation");
	          break;  //breaks are optional but highly recommended
	          
	      default: //in case the wrong browser is selected for automation testing (for example case 101 -not present in this program the default block will execute
	    	  System.out.println("Wrong Selection. Please select 1,2,3 or 4"); 
	          break;
			
		}

	
		
		
	}

}
