//Write a program to find the minimum and maximum elements in an array
package basicjavaprogram;


public class Array_FindMinMaxElements  {
	public static void main(String[] args) {
	
        int[] numbers = {5, 27, 91, };

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
            }
        
    }



