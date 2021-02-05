package ex0707;

/**
 * Count single digits) 
 * Write a program that generates 100 random integers between 0 and 9 and 
 * displays the count for each number. (Hint: Use an array of ten integers, say counts,
 * to store the counts for the number of 0s, 1s, ..., 9s.)
 */

/**
 *
 * @author kristiyan
 */
public class EX0707 {
    /** Main method. */
    public static void main(String[] args) {
        int[] counts = new int[10];         // Array of ten integers.
        for (int i = 1; i <= 100; i++) {
            counts[(int)Math.random() * 10]++;
        }
        // Display results.
        System.out.println("Count for each number");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
    }
}
