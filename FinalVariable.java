package basicjavaprogram;

//Assignment 21: WAP on Final Variable

public class FinalVariable {
	
	final static double pi =3.14; //final global(static) variable

	public static void main(String[] args) {
		
		final int Months_Per_Year = 12; //final local variable
		System.out.println("final local variable " + Months_Per_Year ); // updated after the assignment is sent. forgot to do the part + Months_Per_Year
		System.out.println("final global variable " + pi);
		

	}

}
