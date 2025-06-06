//THIS CLASS IS CREATED TO BE USED FOR BOTH ASSIGNMENTS 57 (Case 3) and 58 (Case 4)

//Assignment 57: WAP on Access specifiers outside the package by becoming the subclass for methods - Case 3
//Class2 (child class) is present in a different package called AccessSpecifier_Case3


//Assignment 58: WAP on Access specifiers outside the package without becoming the subclass for methods - Case 4


package basicjavaprogram;

public class Class1 { //This is the parent class (for the Access Specifier: Case 3). For Case 4 ignore this comment
	
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

}
