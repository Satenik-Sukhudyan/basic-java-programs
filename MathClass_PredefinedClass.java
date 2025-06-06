package basicjavaprogram;
public class MathClass_PredefinedClass 

{

	public static void main(String[] args) 
	{
		
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.multiplyExact(5, 5));
		System.out.println(Math.max(0.5, 2.5)); // max means the greatest number between 2 numbers
		System.out.println(Math.min(5, 0)); //min means the smallest number between 2 numbers
		System.out.println(Math.absExact(-7)); //it returns an absolute number if argument is positive, if it is negative it returns positive
		
		double pi = Math.PI;
		System.out.println(Math.PI);
		
		
		System.out.println(Math.random());
	}

}
