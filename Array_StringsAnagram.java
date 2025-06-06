//Assignment 83: WAP to find out if the given 2 strings are anagram         

package basicjavaprogram;

import java.util.Arrays;

public class Array_StringsAnagram {

	public static void main(String[] args) {
		String a = "tea";
		String b = "eat";
		
		if (a.length()!= b.length()) //outer if: checks if lengths are different
		
		{
		
		System.out.println("The given words are not anagrams");
		
		}
		
		else //outer else: executes if lengths are equal
			
		{
			System.out.println("The length of two string are same");
			
			//Convert Strings into char array
			char c1[] = a.toCharArray(); 
			char c2[] = b.toCharArray();
			
			//Printing character values in array format before sorting
			System.out.println("Before sorting c1 is " + Arrays.toString(c1));
			System.out.println("Before sorting c2 is " + Arrays.toString(c2));
			
			//Sort
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			//Printing character values in array format after sorting
			System.out.println("After sorting c1 is " + Arrays.toString(c1));
			System.out.println("After sorting c2 is " + Arrays.toString(c2));
			
			
			//Compare the characters in c1 and c2 after sorting
			
			boolean b1 = Arrays.equals(c1, c2);
			
			   if (b1==true) //inner else: checks if sorted arrays match
				
			     {
				System.out.println("The given words are anagrams");
			     }
				
			    else //inner else: if arrays don't match
				
			    {
				System.out.println("The given words are not anagrams");
			    }
			
			
			
		}

	}

}