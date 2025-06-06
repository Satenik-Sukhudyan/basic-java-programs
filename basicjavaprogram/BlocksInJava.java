package basicjavaprogram;
//Assignment 61 : WAP on SIB and IIB

public class BlocksInJava {
	
	//Assignment 61 : WAP on SIB and IIB
	
	static
	{
		System.out.println("SIB 1");
	}
	
	static
	{
		System.out.println("SIB 2");
	}
	
	{
		System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}

	
	BlocksInJava()
	
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		new BlocksInJava ();

	}

}
