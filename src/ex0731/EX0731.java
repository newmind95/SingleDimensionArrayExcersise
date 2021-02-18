package ex0731;

/**
 * (Merge two sorted lists
 * Write the following method that merges two sorted lists into a new sorted list.
 * 
 * public static int[] merge(int[] list1, int[] list2)
 * 
 * Implement  the  method  in  a  way  that  takes  at  most 
 * list1.length  +  list2.length  comparisons.  
 * Write  a  test  program  that  prompts  the  user  to  enter  two  sorted 
 * lists and displays the merged list. Here is a sample run.
 * Note that the first number in the input indicates the number
 * of the elements in the list. This number is not part of the list.
 * 
 * Enter list1: 5 1 5 16 61 111
 * Enter list2: 4 2 4 5 6
 * The merged list is 1 2 4 5 5 6 16 61 111
 */

/**
 *
 * @author kristiyan
 */
public class EX0731 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter list1.
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        // Prompt the user to enter list2.
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        
        System.out.println("The merged list is: " + merge(list1, list2));
    }
    
    public static int[] merge(int[] list1, int[] list2) {
        int list1Length = list1.length;
        int list2Length = list2.length;
        
        int[] merged = new int[list1Length + list2Length];
        
        int list1Position, list2Position, mergedPosition;
        list1Position = list2Position = mergedPosition = 0;
        
        while (list1Position < list1Length && list2Position < list2Length) {
            if (list1[list1Position] < list2[list2Position]) {
                merged[mergedPosition++] = list1[list1Position++];
            } else {
                merged[mergedPosition++] = list2[list2Position++];
            }
        }
        
        while (list1Position < list1Length) {
            merged[mergedPosition++] = list1[list1Position++];
        }
        while (list2Position < list2Length) {
            merged[mergedPosition++] = list2[list2Position++];
        }
        return merged;
    }

}
