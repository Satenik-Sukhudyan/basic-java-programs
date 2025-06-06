package basicjavaprogram;

public class SwitchCase_LocalVariable 

{

	public static void main(String[] args) 
	
  {		  
      switch (1)
      
    {		  
      case 1: 
    	  int a=20;
          int b=5;
    	  int c=a+b;  
		  System.out.println(c);
		  break;// break is optional, e.g if I remove it then the case 1 and 2 will be executed only. If I remove the break from all cases then all 4 cases will run 
      
      case 2:
    	  int g=20;
          int h=5;
    	  int d=g-h;
    	  System.out.println(d);
    	  break; 
      
      case 3:
    	  int j=20;
          int k=5;
    	  int l=j/k;
    	  System.out.println(l);
          break; 
      
      case 4:
    	  int n=20;
          int m=5;
    	  int t=n*m;
    	  System.out.println(t);
          break;      
		
	}

   }
	
 }
