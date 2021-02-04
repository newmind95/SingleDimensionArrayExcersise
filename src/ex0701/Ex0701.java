package ex0701;

/**
 * (Assign  grades)  Write  a  program  that  reads  student  scores,  gets  the  best  score, 
 * and then assigns grades based on the following scheme:
 * Grade is A if score is >= best-10
 * Grade is B if score is >= best-20;
 * Grade is C if score is >= best-30;
 * Grade is D if score is >= best-40
 * ;Grade is F otherwise.
 * The program prompts the user to enter the total number of students,
 * then prompts the user to enter all of the scores, and concludes by displaying the grades. 
 * Here is a sample run:
 * Enter the number of students: 4
 * Enter 4 scores: 40 55 70 58
 * Student 0 score is 40 and grade is C
 * Student 1 score is 55 and grade is B
 * Student 2 score is 70 and grade is A
 * Student 3 score is 58 and grade is B
 */


/**
 *
 * @author kristiyan
 */
public class Ex0701 {
    /** Main method. */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter number of students.
        System.out.print("Enter the number of students: ");
        int[] score = new int[input.nextInt()];
        char[] grade = new char[score.length];
        // Prompt the user to enter all scores;
        System.out.print("Enter " + score.length + " scores: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }
        
        // Get student score
        getStudentScore(score, grade);
        
        for (int i = 0; i < score.length; i++) {
            System.out.println("Student " + i + " score " + score[i] +
                    " and grade is " + grade[i]);
        }
    }
    
    /** Method to get max result. */
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    
    /** Method to calculate student's score. */
    public static void getStudentScore(int[] score, char[] grade) {
        int best = max(score);       
        for (int i = 0; i < score.length; i++) {
        if (score[i] >= best - 10) {
                grade[i] = 'A';
            } else if (score[i] >= best - 20) {
                grade[i] = 'B';
            } else if (score[i] >= best - 30) {
                grade[i] = 'C';
            } else if (score[i] >= best - 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
           }
        }
    }
}
