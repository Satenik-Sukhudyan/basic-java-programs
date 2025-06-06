package basicjavaprogram;

import java.util.Scanner;

//Assignment 37: WAP to print Area of Rectangle using Scanner Class

//formula to calculate the area of rectangle: area = a*b (where 'a' is the length and 'b' is the width)

public class ScannerClass_RectangleArea {

	public static void main(String[] args) {
		
		Scanner R = new Scanner (System.in);
		
		System.out.println("Enter the length value");
		double a = R.nextDouble();
		
		System.out.println("Enter the width value");
		double b = R.nextDouble();
		
		double Area = a * b;
		System.out.println ("The area of the rectangle is:"  + (Area));
		
		R.close();
	
	}

}
