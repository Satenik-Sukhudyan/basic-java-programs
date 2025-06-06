//Assignment 89: WAP on constructors of a String Buffer and constructors of a String Builder

package basicjavaprogram;

public class StringBuffer_StringBuilder_Constructors {

	public static void main(String[] args) {
		

 // String Buffer Constructors
		
		StringBuffer sbf1 = new StringBuffer();
		System.out.println("StingBuffer no-argument constructor"); //initial capacity 16 by default
		
		StringBuffer sbf2 = new StringBuffer(30);
		System.out.println("StingBuffer constructor with int parameter (empty) " + sbf2); //sets custom initial capacity (empty String buffer with the specified capacity as length)
		System.out.println("StingBuffer constructor with int parameter is " + sbf2.capacity());// prints the custom capacity (30)
		
		StringBuffer sbf3 = new StringBuffer("Test1");
		System.out.println("StingBuffer constructor with String parameter -> " + sbf3 );
		
		System.out.println(); //empty line to separate String Buffer and String Builder constructors outputs
		
		
//String Builder Constructors
		
		StringBuilder sbd1 = new StringBuilder();
		System.out.println("StringBuilder no-argument constructor"); //initial capacity 16 by default
		
		StringBuilder sbd2 = new StringBuilder(10);
		System.out.println("StringBuilder constructor with int parameter (empty) " + sbd2); //sets custom initial capacity (empty String builder with the specified capacity as length)
		System.out.println("StringBuilder constructor with int parameter is " + sbd2.capacity());// prints the custom capacity (30)
		
		StringBuilder sbd3 = new StringBuilder("Test2");
		System.out.println("StringBuilder constructor with String parameter -> " + sbd3 );	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
