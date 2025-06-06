package basicjavaprogram;
public class RevisionRequest {

	public static void main(String[] args) {
		System.out.println("Quick question to the class: Do we all agree on having a revisionday before the exam?");
		
		String classOpinion = "Everyone" ; //Try changing this to test different responses
		
		switch (classOpinion) {
			
			case "Everyone":
				System.out.println("Everyone agrees on revision!");
				break;
			case "Some":
				System.out.println("Some agree, some don't, but it still worth it!");
				break;
			case "None":
				System.out.println("None? No, you also need it! ");
				break;
			default:
				System.out.println("Let's do it!");
		}		

	}

}
