package ex0704;

/**
 * (Analyze scores) 
 * Write a program that reads an unspecified number of scores and determines 
 * how  many  scores  are  above  or  equal  to  the  average  and  how 
 * many  scores are below the average. 
 * Enter a negative number to signify the end of the input.
 * Assume that the maximum number of scores is 100.
 */

/**
 *
 * @author kristiyan
 */
public class EX0704 {
    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter scores: ");
        int numberOfScores = input.nextInt();
        int[] score = new int[100];
        
          //Get average of scores.
        int average = getAverage(score);
        System.out.println("The average is: " + average);
         // Get score and display result.
        int above = getAboveOrBelowAverage(score, numberOfScores);
        System.out.println("Above average is: " + above);
    }
    
    /** Method to return the sum of scores. */
    public static int getAboveOrBelowAverage(int[] array, int numberOfScores) {
        int sum = 0;           // Initial is 0.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                break;
            }
        }
        return sum /= numberOfScores;
    }
    
    /** Method calculate the average. */
    public static int getAverage(int[] array) {
        int count = 0;     // Initial is 0. 
        int average = count / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                count++;
            }
        }
        return average;
    }
}
