package ex0710;

/**
 * (Find the index of the smallest element) 
 * Write a method that returns the index of the  smallest  element  
 * in  an  array  of  integers.  If  the  number  of  such  elements  is  
 * greater than 1, return the smallest index.
 * Use the following header:
 * 
 * public static int indexOfSmallestElement(double[] array)
 * 
 * Write  a  test  program  that  prompts  the  user  to  enter  ten  numbers
 * invokes  this  method to return the index of the smallest element, and displays the index.
 */

/**
 *
 * @author kristiyan
 */
public class EX0710 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner.
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] array = new double[10];     // Initialize array.
        // Prompt the user to enter ten numbers.
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        int smallestElement = indexOfSmallestElement(array);
        // Display result.
        System.out.println("The smallest element is: " + smallestElement);
    }
    
    /** Method to get the smallest index of element. */
    public static int indexOfSmallestElement(double[] array) {
        double smallestElement = array[0];        // Store the smallest element.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
            }
        }
        return (int)smallestElement;
    }
}
