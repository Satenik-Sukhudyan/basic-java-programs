package basicjavaprogram;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		//Create  a Stack of Integers
		Stack <Integer> s1 = new Stack <Integer>();
		
		// Push elements into the stack
		s1.push(10);
		s1.push(20);
		s1.push(35);
		
		//Display the stack
		System.out.println("Stack: " + s1);
		
		//Peek at the top element (doesn't remove it)
		System.out.println("Top element of Stack using peek: " + s1.peek());
		
		//Pop the top element (removes it)
		int popped = s1.pop();
		System.out.println("The popped element in Stack is: " + popped);
		
		//Check if the stack is empty
		System.out.println("Is stack empty?: " + s1.empty());
		
		//Final stack state
		System.out.println("The final state of Stack is: " + s1);
		
		//Adding an element using the Vector class method (inherited)
		s1.addElement(350);
		System.out.println("The updated Stack using AddElement (inherited from Vector class) is: " + s1);
		
		// 

	}

}
