package ex0708;

/**
 * (Average an array)
 * Write two overloaded methods that return the average of an array with 
 * the following headers:
 * public static int average(int[] array)
 * public static double average(double[] array)
 * Write a test program that prompts the user to enter ten double values,
 * invokes this method, and displays the average value.
 */

/**
 *
 * @author kristiyan
 */
public class Ex0708 {
    /** Main method. */
    public static void main(String[] args) {
        double[] doubleArray = new double[10];
        // Display result of double values.
        System.out.printf("Average of double values is: %.2f%n", average(doubleArray));
        
        // Display result of int values.
        int[] intArray = new int[10];
        System.out.printf("Average of int values is: %d%n", average(intArray));
    }
    
    /* Method to get average in int value. */
    public static int average(int[] array) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter ten integer values.
        System.out.print("Enter ten integer values: ");
        int numbers = input.nextInt();
        int count = 0;          // Inital is 0.
        int sum = 0;            // Initial is 0.
        for (int i = 0; i < numbers; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        return sum / numbers;
    }
    
    /** Method to get average in double value. */
    public static double average(double[] array) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter ten double values.
        System.out.print("Enter ten double values: ");
        double numbers = input.nextDouble();
        double count = 0;          // Initial is 0.
        double sum = 0;            // Initial is 0.
        for (int i = 0; i < numbers; i++) {
            array[i] = input.nextDouble();
            sum += array[i];
        }
        return sum / numbers;
    }
}
