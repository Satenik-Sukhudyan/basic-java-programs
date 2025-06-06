package basicjavaprogram;

//Assignment 20: WAP on Constructor Overloading

public class ConstructorOverloading 

{
	ConstructorOverloading(int a)
	
	{
		System.out.println("1");
	}

    ConstructorOverloading()
	
	{
    	System.out.println("2");
	}
    
    ConstructorOverloading(int a, double b)
	
	{
    	System.out.println("3");
	}
	
   ConstructorOverloading(int a, double b, int c)
	
	{
    	System.out.println("4");
	}
	
public static void main(String[] args) 
	
{
new ConstructorOverloading(); // this will call the constructor with no parameter
new ConstructorOverloading(5); // first we pass the int value and this will call the constructor with parameter
new ConstructorOverloading(4, 32.1); //passing the parameters and this will call the 3rd constructor (with params)
new ConstructorOverloading(4, 32.1, 10);//passing 3 parameters and this will call the 4th constructor (with params)

// We can also call the constructors with another syntax (by just creating and object)
ConstructorOverloading g1 = new ConstructorOverloading();


}

}
