package ex0715;

/**
 * (Eliminate duplicates) 
 * Write a method that returns a new array by eliminating the duplicate values
 * in the array using the following method header:
 * 
 * public static int[] eliminateDuplicates(int[] list)
 * 
 * Write a test program that reads in ten integers, 
 * invokes the method, and displays the result. 
 * Here is the sample run of the program:
 * Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 * The distinct numbers are: 1 2 3 6 4 5
 * 
 */

/**
 *
 * @author kristiyan
 */
public class EX0715 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] list = new int[10];
        // Prompt the user to enter ten numbers.
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        
        int[] distinctNumbers = eliminateDuplicates(list);
        // Display result.
        System.out.print("The distinct numbers are: ");
        for (int e: distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
            
    }
    
    /** Method that eliminate duplicates in numbers. */
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinct = new int[list.length];
        int count = 0;
        for (int e: distinct) {
            if (linearSearch(distinct) == -1) {
                distinct[count] = e;
                count++;
            }
        }
        return distinct;
    }
    
    /** Method for finding a key in the list. */
    public static int linearSearch(int[] list) {
        int key = 0;
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
