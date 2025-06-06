package basicjavaprogram;

import java.util.Scanner;

//Assignment 31: WAP to print Area of Circle using Scanner Class

//formula to calculate area of circle: Area = PI*radius^2 

public class ScannerClass_CircleArea {

	public static void main(String[] args) 
	
	{
	
		Scanner C = new Scanner(System.in);
	
		System.out.println("Enter the radius of circle");
		double r = C.nextDouble(); //whatever number user enters at runtime will be stored in r variable (radius)
		

		double area = Math.PI * r * r; //here we use Math class to calculate the are of circle based on the formula
		System.out.println("The area of a circle with that radius is: " + (area));
		
		C.close();
				
		
	}

}
