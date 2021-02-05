package ex0706;

/**
 * (Revise Listing 5.15, PrimeNumber.java) 
 * Listing 5.15 determines whether a number n is prime by checking whether 2,3,4,5,6, ...,n/2 is a divisor.
 * If a divisor is found, n is not prime. A more efficient approach is to check whether
 * any of the prime numbers less than or equal to 2n can divide n evenly. 
 * If not, n is prime. Rewrite Listing 5.15 to display the first 50 prime 
 * numbers using this approach. You need to use an array to store the prime 
 * numbers and later use them to check whether they are possible divisors for n.
 */

/**
 *
 * @author kristiyan
 */
public class EX0706 {
    /** Main method. */
    public static void main(String[] args) {
        int[] primeNumber = new int[50];
        int count = 0;
        int number = 2;
        
        boolean isPrimeNumber = isPrime(primeNumber, number);
        if (isPrimeNumber) {
            count++;
            System.out.println("Numbers are prime: " + isPrimeNumber);
        } else {
            System.out.print(isPrimeNumber);
        }
    }
    
    /** Method to check whether a number is prime. */
    public static boolean isPrime(int[] array, int num) {
        boolean isPrimeNumber = true;
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (divisor % num == 0) {
                // If true, number is not prime.
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
}
