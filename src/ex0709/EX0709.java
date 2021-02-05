package ex0709;

/**
 * (Find the smallest element) 
 * Write a method that finds the smallest element in an array of double values 
 * using the following header:
 * public static double min(double[] array)
 * Write  a  test  program  that  prompts  the  user  to  enter  ten  numbers, 
 * invokes  this  method to return the minimum value, and displays the minimum value.
 * Here is a sample run of the program:
 * Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
 * The minimum number is: 1.5
 */

/**
 *
 * @author kristiyan
 */
public class EX0709 {
    /** Main method. */
    public static void main(String[] args) {
       // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter ten double values.
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        // Display results.
        System.out.println("The minimum number is: " + min(array));
    }
    
    /** Method to find the smallest element in an array of doubles. */
    public static double min(double[] array) {
        double min = array[0];         // Initial is 0.
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
