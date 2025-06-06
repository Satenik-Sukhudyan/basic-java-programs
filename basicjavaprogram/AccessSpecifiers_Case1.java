//Assignment 55: WAP on Access specifiers within class for methods

package basicjavaprogram;
public class AccessSpecifiers_Case1 {
	
	
	public static void add()
	{
	int a = 2;
	int b = 10;
	System.out.println(a+b);
	}
	
    private static void sub()
    {
    	int a = 2;
    	int b = 10;
    	System.out.println(b-a);
    }
    	
	
     protected static void mul()
     {
    	int a = 2;
    	int b = 10;
    	System.out.println(a*b);
     }
    		
    static void div() //default/package (no access modifier)
    {
    	int a = 2;
    	int b = 10;
    		System.out.println(b/a);
    }
    	

	      public static void main(String[] args) {
		
	// All 4 methods are accessible within the class because of the access specifiers and not modifiers (static or non-static)
		add();
		sub();
		mul();
		div();

	}

}
