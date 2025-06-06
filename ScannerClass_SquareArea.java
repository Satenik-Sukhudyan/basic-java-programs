package basicjavaprogram;

import java.util.Scanner;

//Assignment 35: WAP to print Area of Square using Scanner Class

// formula to calculate the area of square: area = a*a

public class ScannerClass_SquareArea {

	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		System.out.println("Enter the side a value");
		double s = A.nextDouble();
		
		double area = s*s;
		System.out.println("The square area is: " +  (area));
		
		A.close();

	}

}
