package ex0721;


/**
 * Game bean machine.
 *  The bean machine, also known as a quincunx or the Galton box, 
 * is a device for statistics experiments named after 
 * English scientist Sir Francis Galton. 
 * It consists of an upright board with evenly spaced nails (or pegs) in a triangular form.
 * Balls are dropped from the opening of the board. Every time a ball hits a nail,
 * it has a 50% chance of falling to the left or to the right.
 * The piles of balls are accumulated in the slots at the bottom of the board.
 */

/**
 *
 * @author kristiyan
 */
public class EX0721 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter number of balls to drop
        System.out.print("Enter number of balls to drop: ");
        int drops = input.nextInt();
        
        //Prompt the user to enter the number of slots
        // in the bean machine.
        System.out.print("Enter the number of slots in the bean machine: ");
        int nails = input.nextInt() - 1;
        int numberOfRows = 0;
        int[] slots = new int[drops];
        String[] paths = new String[drops + 1];
        for (int i = 0; i < paths.length; i++) {
            paths[i] = getRandom();
            
            if (paths[i] == "R") {
                numberOfRows++;
            }
            if ((i + 1) % nails == 0) {
                slots[numberOfRows]++;
                numberOfRows = 0;
            }
            
        }
        printList(paths, drops);
        printList(slots);
    }  
    
    public static String getRandom() {
        if ((int) (Math.random() * 2) == 0) {
            return "R";
        } else
            return "L";
    }
    
    /** Method to print the elements in the list. */
    public static void printList(String[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(((i + 1) % num == 0) ? list[num] + "\n" : list[i]);
        }
    }
    
    /** Method to print the list. */
    public static void printList(int[] array) {
        int max = largest(array);
       
        while (max > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= max) {
                    System.out.print("\nO");
                } else {
                    System.out.print(" ");
                }
            }
            max--;
        }
        System.out.println();
    }
    
    /** Method to find the largest number. */
    public static int largest(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
