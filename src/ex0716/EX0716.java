package ex0716;

/**
 * (Execution time) 
 * Write a program that randomly generates an array of 100,000 integers and a key.
 * Estimate the execution time of invoking the linearSearchmethod in Listing 7.6. 
 * Sort the array and estimate the execution time of invoking the binarySearch method in Listing 7.7.
 * You can use the following code template to obtain the execution time:
 * long startTime = System.currentTimeMillis();
 * perform the task;
 * long endTime = System.currentTimeMillis();
 * long executionTime = endTime - startTime;
 */

/**
 *
 * @author kristiyan
 */
public class EX0716 {
    /** Main method. */
    public static void main(String[] args) {
        int[] array = new int[100000];
        long startTime = System.currentTimeMillis();
        int index = (int)startTime;
        System.out.println(linearSearch(array,index));
    }
    
    /** The method for finding a key in the list. */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
    
    /** Use binary search to find the key in the list. */
    public static int binarySearch(int[] list, int key) {
        int low = 0;               // Initial is 0.
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low -1;    // Now high < low, key not found.
    }
    
    /** Method for sorting the numbers. */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i...list.length -1]
            double currentMin = list[i];
            int currentMinIndex = i;
            
            for (int j = i + 1; i < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary.
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
