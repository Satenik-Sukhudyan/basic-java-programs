package basicjavaprogram;

//'assert keyword' by default is disabled so I first enabled it (in Run configurations > VM Arguments added '-ea'

//REMEMBER that automation QA does not use assert keyword, we should use Assert class in TestNG instead

public class AssertKeyword {

	public static void main(String[] args) {
		
		int age=10;
		assert age>=18: "Sorry, the age is less then 18"; //this is assert with message (optional). It will appear in exception
		System.out.println("You can vote");

	}

}
