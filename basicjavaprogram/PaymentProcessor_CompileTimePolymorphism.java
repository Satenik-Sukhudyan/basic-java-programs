package basicjavaprogram;
//WAP on Compile time polymorphism (Method overloading)

public class PaymentProcessor_CompileTimePolymorphism {
	
	void pay (double amount) {
		System.out.println("Paying $" + amount + " with cash");
	}
	
	void pay (double amount,String cardNumber) {
		System.out.println("Paying $" + amount + " using card: " + cardNumber);
	}
	
	void pay (double amount,String bank, String accountNumber) {
		System.out.println("Paying $" + amount + " from " + bank + " account " + accountNumber);
	}		
	
	public static void main(String[] args) {
		
	PaymentProcessor_CompileTimePolymorphism p1 = new PaymentProcessor_CompileTimePolymorphism ();
	p1.pay(100.0);
	p1.pay(100.0, "123-4567-89");
	p1.pay(100.0, "US Bank", "AC3456783");
          
	}

}

