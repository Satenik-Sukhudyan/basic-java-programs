package basicjavaprogram;

public class ReverseNumberProgram {

	public static void main(String[] args) {
	
		int num=446;
		int rev=0;
		while (num!=0) {
			
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
			
		}
		
     System.out.println(rev);		

	}

}
