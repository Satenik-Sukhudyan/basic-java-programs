package basicjavaprogram;

public class String_vs_StringBuffer_vs_StringBuilder {

	public static void main(String[] args) {

//String object created and 'a' poinbts to it.	 
//concat() does not modify the original string 'a' because String is immutable. 
//Instead it creates a new string "Gro Tech Minds" and stores it in "output", but remains "Gro" 
		
		String a = "Gro"; //String 1
		String output=a.concat(" Tech Minds"); //String 2
		       System.out.println(a);

//Mutable StringBuffer object is created, holding the value "Gro"
//Unlike String, StringBuffer modifies the same object (a1) instead of creating a new one:
 // " Tech Minds" is added directly to a1, changing it to "Gro Tech Minds"       
		
	    StringBuffer a1 = new StringBuffer("Gro");
		       a1.append(" Tech Minds");
		       System.out.println(a1);
		       
		       
// same as StringBuffer above		
	   StringBuilder a2 = new StringBuilder("Gro");       
	            a2.append(" Tech Minds");
	            System.out.println(a2);
		       
	}

}
