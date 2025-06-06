package basicjavaprogram;

// Assignment 40: WAP on Single Level Inheritance

class Parentclass_Single // Parent class
{
	static void add()
	
	{
		//optional
		int a = 2;
		int b = 3;
		int sum = a+b;
		
		System.out.println("I am the 'add' static method of a parent class " + sum);
	}
		
}


public class Inheritance_SingleLevel_StaticMethods extends Parentclass_Single
{

		static void sub()
		
		{
			//optional 
			int a = 1; 
		    int b = 3;
			int sum = a-b;
			
			System.out.println("I am the 'sub' static method of a child class " + sum);
		}
		
		public static void main(String[] args) 
		{
			
			sub(); //Child class can utilize the method directly inside its own class
			Parentclass_Single.add(); //using parent's ClassName.staticMethodName() inside child class to call a parent's static method
		  
			
		}

	}
	