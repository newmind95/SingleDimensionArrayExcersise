package ex0719;

import java.util.Arrays;

/** 
 * (Sorted?)
 * Write the following method that returns true if the list is already sorted 
 * in increasing order.
 * 
 * public static boolean isSorted(int[] list)
 * 
 * Write a test program that prompts the user to enter a list and displays whether
 * the list is sorted or not. Here is a sample run. 
 * Note that the first number in the input indicates the number of the elements in the list.
 * This number is not part of the list. 
 * 
 * Enter list: 8 10 1 5 16 61 9 11 1
 * The list is not sorted
 * 
 * Enter list: 10 1 1 3 4 4 5 7 9 11 21
 * The list is already sorted
 */

/**
 *
 * @author kristiyan
 */
public class EX0719 {
    /** Main method. */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter list.
        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        
        boolean isSorted = isSorted(list);
        if (!isSorted) {
            System.out.println("The list is not sorted");
        } else {
            System.out.println("The list is already sorted");
        }
        
    }
    
    /** Method to check whether a list is sorted or not. */
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == i) {
                java.util.Arrays.sort(list);
                return true;
            }
        } 
        return false;
    }
}
