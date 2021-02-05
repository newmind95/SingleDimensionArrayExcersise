package ex0712;

/**
 * (Reverse  an  array)  
 * The  reverse  method  in  Section  7.7  reverses  an  array  by  copying it to a new array. 
 * Rewrite the method that reverses the array passed in the argument and returns this array.
 * Write a test program that prompts the user to enter ten numbers, 
 * invokes the method to reverse the numbers, and displays the numbers.
 */

/**
 *
 * @author kristiyan
 */
public class EX0712 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] list1 = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        reverse(list1);
        
        for (int e: list1) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    
    /** Method to reverse an array. */
    public static int reverse(int[] array) {
        int temp = 0;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return temp;
    }
}
