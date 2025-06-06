package basicjavaprogram;
//WAP on Run time polymorphism (Method overriding)
 

   class Payment { //Parent class - will be overriden by subclasses
	   void process() {
			System.out.println ("Processing the default payment ...");
	   }	
	
}	
	class CreditCardPayment extends Payment{ //1st Child Class
		@Override
		void process() {
			System.out.println ("Processing the Credit Card payment ...");
		}	
}	
	class PayPalPayment extends Payment{ //2nd Child Class
		@Override	
		void process() {
			System.out.println ("Processing the PayPal payment ...");
		}
	}

// Main class that demonstates the Run-Time Polymorphism
public class Payment_RunTimePolymorphism { 
	public static void main (String[] args) {
		
		//Parent class reference pointing to child class objects
	    Payment p1 = new CreditCardPayment(); //runtime polymorphism 
		Payment p2 = new PayPalPayment(); //runtime polymorphism 
		Payment p3 = new Payment(); //plain parent object
		
		// Calling the overriden methods
		p1.process();
		p2.process();
		p3.process();
}
	}
			

	

