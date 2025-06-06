package basicjavaprogram;

//Assignment 51: WAP on Interface with 2 Abstract methods

interface One

{
//abstract methods in interface(by default abstract and public) - both can be shared outside an organization
	void logic1();  
	void logic2(); 
}



public class Interface_with_TwoAbstractMethods implements One //Child Class implementing a parent class

{

	public static void main(String[] args) 
	{
	
	Interface_with_TwoAbstractMethods D = new Interface_with_TwoAbstractMethods(); //created an object of the child class in order to call methods logic1() and logic2()
		D.logic1();
		D.logic2();

	}

	@Override //this line is not necessary but kept it for visual/reference purposes
	public void logic1() 
	{
		//developers will write the internal logic here (hidden -stays within an organization)
		System.out.println("internal logic 1");
	}

	@Override //this line is not necessary but kept it for visual/reference purposes
	public void logic2() 
	{
		//developers will write the internal logic here (hidden -stays within an organization)
		System.out.println("internal logic 2");
	}

}
