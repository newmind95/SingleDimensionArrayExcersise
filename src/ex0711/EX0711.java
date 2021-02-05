package ex0711;

/** (Statistics: compute deviation) Programming Exercise 5.45 computes the standard 
 * deviation of numbers. This exercise uses a different but equivalent formula 
 * to compute the standard deviation of n numbers.
 * 
 * To compute the standard deviation with this formula, you have to store the 
 * individual numbers using an array, so that they can be used after the mean is obtained.
 * Your program should contain the following methods:
 * /** Compute the deviation of double values */
 // public static double deviation(double[] x) 

/** Compute the mean of an array of double values */
 // public static double mean(double[] x) 
 /** Write a test program that prompts the user to enter ten numbers and 
  * displays the mean and standard deviation, as shown in the following sample run:
 */

/**
 *
 * @author kristiyan
 */
public class EX0711 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] array = new double[10];
        // Prompt the user to enter ten double values.
        System.out.print("Enter ten double values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f%n", mean(array));
        System.out.printf("The standard deviation is: %.5f%n", deviation(array));
    }
    
    /** Compute the deviation of double values. */
    public static double deviation(double[] x) {
        double standardDeviation = 0;           // Initial is 0.
        int num = x.length;
        for (int i = 0; i < x.length; i++) {
            standardDeviation += x[i];
        }
        return Math.sqrt(standardDeviation / num);
    }
    
    /** Compute the mean of an array of double values. */
    public static double mean(double[] x) {
        double sum = 0;
        int num = x.length;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / num;
    }
}
