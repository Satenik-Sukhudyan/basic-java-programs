package basicjavaprogram;
//Assignment 53: WAP on Multiple Level Inheritance

interface Dad {
	void drive();
}

interface Mom {
	void cook();
}

public class Inheritance_Multiple implements Dad,Mom {

  static void play()
  {
	  System.out.println("I am the child. I should play");
  }

  void eat()
  {
	  System.out.println("I am the child. I should eat. ");
  }

	     public static void main(String[] args) {
	    	 Inheritance_Multiple S = new Inheritance_Multiple();
	    	 S.drive();
	    	 S.cook();
	    	 S.play();// but possible also to call directly - play()
	    	 S.eat();    	   	
	}
	     // Overridden methods
	public void cook() {
		//developers will write the internal logic here (hidden -stays within an organization)
				System.out.println("Mom's internal logic");		
	}

	public void drive() {
		System.out.println("Dad's internal logic");		
	}

}
