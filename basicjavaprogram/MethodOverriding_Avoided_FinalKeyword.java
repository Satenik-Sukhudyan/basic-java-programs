package basicjavaprogram;

//Assignment 49: WAP to avoid Method Overriding using Final Method

class Dev { //parent class

    final void login () //used the final keyword which prevents the parent class method to get overriden by child class method

     {
	     System.out.println("login using email ID");
	
     }

}


public class MethodOverriding_Avoided_FinalKeyword extends Dev { // child class without overriding final method
	
	void loginWithMobile() // A new method instead of overriding login ()

   { 
		
		 System.out.println("login using mobile number"); 
   }

	public static void main(String[] args) {
		
		MethodOverriding_Avoided_FinalKeyword m1 = new MethodOverriding_Avoided_FinalKeyword (); //creating an object of the child class
		m1.login(); //calls parent class method
		m1.loginWithMobile(); //calls new method in child class
				

	}

}
