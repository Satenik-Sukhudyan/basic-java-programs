package basicjavaprogram;

import java.util.Scanner;

//Assignment 38: WAP to print Perimeter of Rectangle using Scanner Class

// formula to calculate the perimeter of a rectangle: P = 2(a+b) where 'a' is the width 

public class ScannerClass_RectanglePerimeter {

	public static void main(String[] args) {
		
     Scanner b = new Scanner (System.in);
     
    
	System.out.println("Enter width");
	double a = b.nextDouble();
	
	
	System.out.println("Enter length");
	double c = b.nextDouble();
	
	
	double perimeter = 2*(a+c);
	System.out.println("The perimeter of the rectangle is "  + (perimeter));
	
	b.close();
	
		
	}

}
