package basicjavaprogram;
//Assignment 48: WAP on This Keyword

public class thisKeyword {
	
	// Global variables
	String firstname;
	String lastname;
	int age;
	double gpa;
	
	//Method to assign values to global variables using 'this' keyword
	void Student(String firstname, String lastname, int age, double gpa) {
		
	//Printing local variables before assignment	
		System.out.println("Student's first name: " + firstname);
		System.out.println("Student's last name: " + lastname);
		System.out.println("Student's age is: " + age);
		System.out.println("Student's gpa is: " + gpa);
		
	//Assigning local values to global variables using 'this' keyword	
		  this.firstname = firstname;
		  this.lastname = lastname;
		  this.age = age;
		  this.gpa = gpa;
		
	}

	public static void main(String[] args) {
		thisKeyword t1 = new thisKeyword (); //creating an object of the class
		t1.Student("Sat","Suk", 20, 3.8); //calling the method and passing local values
		
	//Accessing global variables
		System.out.println (t1.firstname);
		System.out.println (t1.lastname);
		System.out.println (t1.age);
		System.out.println (t1.gpa);

	}

}
