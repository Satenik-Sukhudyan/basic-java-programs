package basicjavaprogram;

import java.util.Scanner;

//Assignment 34: WAP to print Perimeter of Triangle using Scanner Class

//formula to calculate the perimeter of a triangle: P = a+b+c (where 'a', 'b', and 'c' are the length of the 3 sides of the triangle

public class ScannerClass_TrianglePerimeter {

	public static void main(String[] args) {

		Scanner N = new Scanner (System.in);
		
		System.out.println("Enter the value of the 'a' side");
		double h = N.nextDouble();
		
		
		System.out.println("Enter the value of the 'b' side");
		double x = N.nextDouble();
		
		System.out.println("Enter the value of 'c' side");
		double y = N.nextDouble();
		
		
		double perimeter = h+x+y;
		System.out.println("The perimeter of a triangle is  " + (perimeter));
		
		N.close();			

	}

}
