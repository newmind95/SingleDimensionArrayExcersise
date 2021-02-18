package ex0727;

/**
 *
 * @author kristiyan
 */
public class EX0727 {

    /**
     * Main method.
     */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);

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

    /**
     * Method to check whether a list is identical
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        sort(list1);
        sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int minIndex = 1;
            
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
