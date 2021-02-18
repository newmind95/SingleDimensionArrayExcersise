package ex0734;

/**
 * (Sort characters in a string)
 * Write a method that returns a sorted string using the following header: 
 * 
 * public static String sort(String s)
 * 
 * For example, sort("acb") returns abc.
 * 
 * Write a test program that prompts the user 
 * to enter a string and displays the sorted string.
 */

/**
 *
 * @author kristiyan
 */
public class EX0734 {
    /** Main method. */
    public static void main(String[] args) {
        System.out.println(sort("acbed"));
    }
    
    /** Method to sort a string. */
    public static String sort(String s) {
       char[] tempArray = s.toCharArray();
       java.util.Arrays.sort(tempArray);
       String sorted = new String(tempArray);
       return sorted;
    }
}
