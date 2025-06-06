package basicjavaprogram;

import java.util.Scanner;

public class PracticeScanner {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter your name");
		s1.next();
		
		System.out.println("Enter your age");
		s1.nextInt();
		System.out.println("");
		
		System.out.println("Provide name 1");
		String name1 = s1.next();
		
		System.out.println("Provide name 2");
		String name2 = s1.next();
		
		
		
		boolean b1 = name1.equals(name2);
		System.out.println(b1);
		System.out.println("Provided 2 names are not matching");
		
		System.out.println("Type true or false");
		boolean b2 = s1.nextBoolean();
		System.out.println(b2);
		System.out.println("I did the assignment");
		
		
		s1.close();
	}

}
