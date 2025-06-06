package basicjavaprogram;

//Assignment 46: WAP on method overriding

class PreCondition{ //parent class

     void login () //Rule 2: non-static method in parent class (Rule 3: same return type and name as in the method of a child class)

      {
	     System.out.println("login using email ID"); // Rule 4: method body is different from the child method's body
	
      }

}


public class MethodOverriding extends PreCondition{ // Rule 1: Child class - extending the parent class (relationship established)
	
	void login () // Rule 2:non-static method in child class (Rule 3: same return type and name as in the method of a parent class)

    { 
		
		 System.out.println("login using mobile number"); //Rule 4: method body is different from the parent method's body
    }

	public static void main(String[] args) {
		
		MethodOverriding m1 = new MethodOverriding (); //creating an object of the child class
		m1.login(); 
//trying to call the parent's login method by using the object's reference but getting the output of the child's login method - the parent method got overriden
//the parent class method will never come into an output unless we use the 'super' keyword in the child class		
		
		

	}

}
