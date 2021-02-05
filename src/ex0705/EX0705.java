package ex0705;

/**
 * (Print distinct numbers)
 * Write a program that reads in ten numbers and displays the number 
 * of distinct numbers and the distinct numbers separated by exactly one space 
 * (i.e., if a number appears multiple times, it is displayed only once). 
 * (Hint:Read a number and store it to an array if it is new. 
 * If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers. 
 * Here is the sample run of the program:
 *  Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 *  The number of distinct number is 6
 * The distinct numbers are: 1 2 3 6 4 5
 */


/**
 *
 * @author kristiyan
 */
public class EX0705 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner.
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] array = new int[10];
        int num;
        int count = 0;
        // Prompt the user to enter ten integers.
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            // Test if num is dinstinct
            if (isDistinct(array, num)) {
                array[count] = num;
                count++;
            }
        }
        // Display results.
        System.out.println("The number of distinct is: " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) 
                System.out.print(" " + array[i]);
        }
        System.out.println();
    }
    
    /** Method to check whether a number is distinct. */
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;       // If number is is not in an array return false.
        }
        // Otherwise return true.
        return true;
    }
}
