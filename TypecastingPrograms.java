package basicjavaprogram;
public class TypecastingPrograms {

	public static void main(String[] args) {
	
		//Assignment 107: WAP to convert int into double using both implicitly and explicitly
		double d1 = 5;
		System.out.println(d1); //Widening - implicit 
		
		double d2 = (double) 7;
		System.out.println(d2); //Widening - explicit 
		
		//Assignment 108: WAP to convert double into int 
		int a = (int) 3.2583; //Narrowing - explicit
		System.out.println(a);
		
		//Assignment 109: WAP to convert double into float
		float f = (float) 5.4; //Explicit typecasting (narrowing)
		System.out.println(f);
		
		//Assignment 110: WAP to convert byte into int
		int i1 = (int)25; //Explicit typecasting (widening)
		System.out.println(i1);
		int i2 = 35; //Implicit typecasting (widening)
		System.out.println(i2);
		
		//Assignment 111: WAP to convert int into byte
		byte b1 = (byte)125; //byte can only store values from -128 to 127
		System.out.println(b1);
		
		//Assignment 112: WAP to convert int into byte where int value is 10000
		int i3 =10000; // 10000 is outside the byte range (-128 to 127) so it overflows and becomes 16
		byte b2 = (byte)i3 ;
		System.out.println(b2); //Java keeps only the last 8 bits and those 8 bits = 16
		
		//Assignment 113: WAP to convert short into byte
		byte b3 = 34; //Implicit typecasting (widening)
		System.out.println(b3);
		byte b4 = (byte)54; //Explicit typecasting (widening)
		System.out.println(b4);
		
		//Assignment 114: WAP to convert short into int
		int i4 = (int)65; //Explicit typecasting (widening)
		System.out.println(i4);
		int i5 = 6; //Implicit typecasting (widening)
		System.out.println(i5);
		
		//Assignment 115: WAP to convert float into double
		double d3 = 54.2f;  //Explicit typecasting (widening)
		System.out.println(d1);
		double d4 = (double)6.6453f;  //Implicit typecasting (widening)
		System.out.println(d4);
		
		
		
	
	}

}
