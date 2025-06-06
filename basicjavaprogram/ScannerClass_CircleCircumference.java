package basicjavaprogram;

import java.util.Scanner;

//Assignment 32: WAP to print Circumference of Circle using Scanner Class

//formula to calculate the circumference of a circle is: C = 2*PI*r 

public class ScannerClass_CircleCircumference {

	public static void main(String[] args) {
		
		Scanner G = new Scanner (System.in);
		
		System.out.println("Enter the value of circle radius");
		double d = G.nextDouble();
		
		double circumference = Math.PI*2*d;
		System.out.println("The circumference of the circle is: " + (circumference));
	
		
		G.close();

	}

}
