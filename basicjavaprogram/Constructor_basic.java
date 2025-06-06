package basicjavaprogram;

//Assignment 17 - WAP on constructor and call them	

public class Constructor_basic
{

  Constructor_basic() 
  {
	System.out.println("this is constructor");  
  }
	
	
	public static void main(String[] args) {
// constructor will be called automatically the moment the object got created		
		
Constructor_basic C1 = new Constructor_basic(); //first syntax to create an object
Constructor_basic C2 = new Constructor_basic(); //can create as many objects as we want to
new Constructor_basic(); // second syntax to create an object	
new Constructor_basic(); //can create as many objects as we want to
	}

}
