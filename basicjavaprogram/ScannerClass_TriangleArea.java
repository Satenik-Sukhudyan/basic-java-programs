package basicjavaprogram;

import java.util.Scanner;

//Assignment 33: WAP to print Area of Triangle using Scanner Class

//formula to calculate the area of triangle: area = 0.5 * b * h

public class ScannerClass_TriangleArea {

	public static void main(String[] args) {
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("Enter the base value");
		double b = S.nextDouble();
		
		System.out.println("Enter the height value");
		double h = S.nextDouble();
		
		double area = 0.5 * b * h;
		System.out.println("The triangle area is: " +  (area));
		
		S.close();
		

	}

}
