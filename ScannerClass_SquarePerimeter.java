package basicjavaprogram;

import java.util.Scanner;

//Assignment 36: WAP to print Perimeter of Square using Scanner Class

// formula to calculate the perimeter of a square: P = 4a 

public class ScannerClass_SquarePerimeter {

	public static void main(String[] args) {
		
        Scanner d = new Scanner (System.in);
   
   
        System.out.println("Enter the value of the square side");
        double a = d.nextDouble();
        
        double perimeter = 4*a;
        
        System.out.println("The perimeter of the square is: " + (perimeter));
		
		
		d.close();
		
	}

}
