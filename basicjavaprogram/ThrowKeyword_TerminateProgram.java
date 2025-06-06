package basicjavaprogram;

import java.net.MalformedURLException;

//Assignment 66: WAP to terminate any program using Throw keyword

public class ThrowKeyword_TerminateProgram {

	public static void main(String[] args) throws MalformedURLException {
	
		System.out.println("My program started");
		
		throw new MalformedURLException ("My program terminated using checked  exception");

	}

}
