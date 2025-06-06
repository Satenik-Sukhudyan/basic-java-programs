package basicjavaprogram;
//Assignment 119: WAP on Encapsulation
class Logicclass
{
	//Username
	private String un = "contact@grotechminds.com";// 'un' is declared as global variable
	public String getUn()//getter method to return the Username 
	{
		return un; 
	}
	public void setUn(String un)//Setter method to assign local 'un' value to global 'un'
	{
		this.un=un; 
	}
	
	//Age
	private int age=25; // 'age' is declared as global variable
	public int getAge() //Getter method to return age
	{
		return age;
	}
	public void setAge(int age) //Setter method to assign local 'age' to global 'age'
	{
		this.age=age;
	}
	
	//Salary
	private double salary=50000.0; // 'salary' is declared as global variable
	public double getSalary() //Getter method to return salary
	{ 
		return salary;
	}
	public void setSalary(double salary) //Setter method to assign local 'salary' to 'global' salary
	{
		this.salary = salary;
	}
	
}
public class EncapsulationCode 
{

  public static void main(String[] args) {
	   //Step 1: Create an object of the Logicclass
	    Logicclass l1=new Logicclass(); 
	    
	  //Step 2: Assign values using the setter methods 
	  // These setters assign values to the local variables inside the class  
		l1.setUn("Sate@gmail.com"); // Setting username
		l1.setAge(26); //Setting Age 
		l1.setSalary(70000.6); //Setting Salary
		
	// Step 3: Get and Print the values using getter method	
		System.out.println(l1.getUn());
		System.out.println(l1.getAge());	
		System.out.println(l1.getSalary());

		
	}
	
}


