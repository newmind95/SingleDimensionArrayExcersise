package ex0702;

/**
 * (Reverse the numbers entered) 
 * Write a program that reads ten integers and 
 * dis-plays them in the reverse of the order in which they were read.
 */

/**
 *
 * @author kristiyan
 */
public class EX0702 {
    /** Main method. */
    public static void main(String[] args) {
       int[] array = new int[10];
       // Prompt the user to enter ten integers.
       System.out.print("Enter ten integers: ");
       
       // Fill an array.
       fill(array);
       // Display result.
       for (int i = array.length - 1; i >= 0; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();
    }
    
    /** Method to fill an array. */
    public static void fill(int[] array) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < array.length;i ++) {
            array[i] = input.nextInt();
        }
    }
}
