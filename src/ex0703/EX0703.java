package ex0703;

/**
 * (Count occurrence of numbers) 
 * Write a program that reads the integers between 1 and 100 and 
 * counts the occurrences of each. Assume the input ends with 0.
 * Here is a sample run of the program:
 * 
 * Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
 * 2 occurs 2 times
 * 3 occurs 1 time
 * 4 occurs 1 time
 * 5 occurs 2 times
 * 6 occurs 1 time
 * 23 occurs 1 time
 * 43 occurs 1 time
 * Note that if a number occurs more than one time, the plural word “times” is used in the output.
 */

/**
 *
 * @author kristiyan
 */
public class EX0703 {
    /** Main method. */
    public static void main(String[] args) {
        int[] number = new int[100];
        int[] count = new int[100];
        int temp = 0;         // Initial is 0.
        // Prompt the user to enter integerse between 1 and 100
        System.out.print("Enter integers between 1 and 100: ");
        
        // read the numbers
        occurrence(number);
        // Display result
        for (int i = 0; i < number.length; i++) {
            temp = number[i];
            count[temp]++;
        }
        for (int i = 1; i < number.length; i++) {
            if (number[i] > 0 && number[i] == 1) {
                System.out.printf("%d occurs %d time%n", i, count[i]);
            } else if (number[i] >= 2) {
                System.out.printf("%d occurs %d times%", i, count[i]);
            }
        }
    }
    
    /* Method to read the numbers. */
    public static void occurrence(int[] array) {      
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] == 0) {
                break;
            }
        }
    }
}
