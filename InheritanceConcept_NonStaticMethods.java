package basicjavaprogram;

class ParentClass2 // Parent class
{
	void parent()
	
	{
			System.out.println("Non-Static method from Parent");
	}
		
}

public class InheritanceConcept_NonStaticMethods extends ParentClass2  {
	
	void child()
	
	{
		super.parent(); //cannot be written in the main method
		System.out.println("Non-Static method from Child");
	}

	public static void main(String[] args) {
		
		InheritanceConcept_NonStaticMethods obj = new InheritanceConcept_NonStaticMethods();
		obj.child();
		
	}

}
