package ex0713;

/**
 * (Random number chooser)
 * Write a method that returns a random number between 1 and 54, 
 * excluding the numbers passed in the argument. 
 * The method header is specified as follows:
 * 
 * public static int getRandom(int... numbers)
 */

/**
 *
 * @author kristiyan
 */
public class EX0713 {
    /** Main method. */
    public static void main(String[] args) {
        int random = getRandom(new int[]{1, 2, 3});
        System.out.println(random);
    }
    
    /** Method to return a random number. */
    public static int getRandom(int... numbers) {
        int temp = 0;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = (int)Math.random() * 54;
            temp += numbers[i];
        }
        return temp;
    }
}
