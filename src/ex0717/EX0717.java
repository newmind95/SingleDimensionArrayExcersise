package ex0717;

/**
 * (Sort students) Write a program that prompts the user to enter the number of
 * students, the students’ names, and their scores, and prints student names in
 * decreasing order of their scores.
 */
/**
 *
 * @author kristiyan
 */
public class EX0717 {

    /**
     * Main method.
     */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter number of students
        System.out.print("Enter number of students: ");
        String[] nameOfStudents = new String[input.nextInt()];
        int[] score = new int[nameOfStudents.length];
        // Prompt the user to enter score.
        for (int i = 0; i < nameOfStudents.length; i++) {
            System.out.print("Enter student's name: ");
            nameOfStudents[i] = input.next();
            System.out.print("Enter student's score: ");
            score[i] = input.nextInt();
        }
        
        selectionSort(score, nameOfStudents);
        
        for (String student: nameOfStudents) {
            System.out.println(student);
        }

    }

    /**
     * Method to get the max result.
     */
    public static void selectionSort(int[] score, String[] str) {
        for (int i = 0; i < score.length; i++) {
            int currentMin = score[i];
            int currentMinIndex = 1;
            String temp;
            
            for (int j = i + 1; j < score.length; j++) {
                if (currentMin > score[i]) {
                    currentMin = score[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                score[currentMinIndex] = score[i];
                score[i] = currentMin;
                // Swap string array
                temp = str[i];
                str[i] = str[currentMinIndex];
                str[currentMin] = temp;
            }
        }
    }

}
