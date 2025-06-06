//Assignment 99: WAP to store account number, account holder name inside Map by passing the values at runtime for both account number, account holder

package basicjavaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapInterface5_Assignment99 {

	public static void main(String[] args) {
		Map<String, Integer> account = new HashMap <String,Integer>();
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the account holder name: ");
		String holdername = s1.next(); // storing the input in variable
		
		System.out.println("Enter the account holder number: ");
		int accNum = s1.nextInt(); // storing the input in variable
		
		account.put(holdername,accNum);
		
		System.out.println("Here are the account details: " + account);
		
		s1.close();
	}

}
