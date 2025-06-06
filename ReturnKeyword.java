package basicjavaprogram;

public class ReturnKeyword
{

	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	static void add(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	System.out.println(add(45,55));
		add(85.6,96);
	}

}
