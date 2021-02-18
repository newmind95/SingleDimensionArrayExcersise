package ex0726;

import java.util.*;

/**
 *
 * @author kristiyan
 */
public class EX0726 {
    /**Main method. */
    public static void main(String[] args) {
        // Create a Scanner.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int size = input.nextInt();
        int[] list1 = new int[size];
        for (int i = 0; i < size; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        size = input.nextInt();
        int[] list2 = new int[size];
        for (int i = 0; i < size; i++) {
            list2[i] = input.nextInt();
        }
        input.close();
        
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }
    
    /** Method to check wether a list is identical. */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
