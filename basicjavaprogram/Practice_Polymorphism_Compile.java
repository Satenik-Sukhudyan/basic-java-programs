package basicjavaprogram;

public class Practice_Polymorphism_Compile {
	
	void pay (double amount)
	
	{
		System.out.println("Paying with cash $" + amount );
	}
	
    void pay (double amount, String cardNumber)
	
	{
    	System.out.println("Paying $" + amount + " with card  " + cardNumber );
	}

    void pay (double amount, String bank, String accountNumber)
	
	{
    	System.out.println("Paying$ " + amount + " from bank " + bank + " with " + accountNumber);
	}
	


	public static void main(String[] args) {
		
		Practice_Polymorphism_Compile p1 = new Practice_Polymorphism_Compile ();
		p1.pay(100.0);
		p1.pay(100.0, "123-456-789");
		p1.pay(100.0, "Chase", "Account123");
		
		
		
		
	}

}
