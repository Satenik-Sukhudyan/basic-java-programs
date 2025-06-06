package basicjavaprogram;

public class SwitchCase_GlobalVariable 
{

	public static void main(String[] args) 	
   {
	
       int a=20; //global variable
	
	 {		  
	      switch (1)
	      
	    {		  
	      case 1: 
	    	  
	          int b=5;
	    	  int c=a+b;  
			  System.out.println(c);
			  break;//break is optional, e.g if I remove it then the case 1 and 2 will be executed only. If I remove the break from all cases then all 4 cases will run 
	      
	      case 2:
	    	 
	          int h=5;
	    	  int d=a-h;
	    	  System.out.println(d);
	    	  break; 
	      
	      case 3:
	    	  
	          int k=5;
	    	  int l=a/k;
	    	  System.out.println(l);
	          break; 
	      
	      case 4:
	    	  
	          int m=5;
	    	  int t=a*m;
	    	  System.out.println(t);
	          break;      
			
		  }

	   }	
	 
   }
	
}
