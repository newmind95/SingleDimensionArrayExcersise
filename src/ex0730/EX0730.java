package ex0730;

/**
 * (Pattern  recognition: 
 * consecutive  four  equal  numbers
 * Write  the  following  method that tests whether the array has
 * four consecutive numbers with the same value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of 
 * integers and dis-plays if the series contains four 
 * consecutive numbers with the same value. 
 * Your program should first prompt the user to enter the input size—i.e.,
 * the number of values in the series. Here are sample runs:
 * 
 * Enter the number of values: 8
 * Enter the values: 3 4 5 5 5 5 4 5
 * The list has consecutive fours
 * 
 * 
 * Enter the number of values: 9
 * Enter the values: 3 4 5 5 6 5 5 4 5
 * The list has no consecutive fours
 */


/**
 *
 * @author kristiyan
 */
public class EX0730 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner.
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int[] size = new int[(input.nextInt())];
        System.out.print("Enter the values: ");
        int[] values = new int[(input.nextInt())];
        for (int i = 0; i < values.length;i++) {
            values[i] = input.nextInt();
        }
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }
    
    public static boolean isConsecutiveFour(int[] values) {
        int count = values[0];
        for (int i = 0; i < values.length; i++) {
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
}
