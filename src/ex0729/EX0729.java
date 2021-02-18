package ex0729;

/**
 * (Game: pick four cards) 
 * Write a program that picks four cards from a deck of 52 cards
 * and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12, 
 * and 11, respectively. Your program should display the number 
 * of picks that yields the sum of 24.
 */

/**
 *
 * @author kristiyan
 */
public class EX0729 {
    /** Main method. */
    public static void main(String[] args) {
        int[] deck;
        
        do {
            deck = new int[52];         // Initialize deck of 52 cards.
            
            getDeck(deck);
        } while (sumCards(deck) != 24);
        
        getCards(deck);
        
    }
    
    public static void getDeck(int[] deck) {
        for (int i = 0; i < 4; i++) {
            deck[(int)(Math.random() * 52)]++;
        }
    }
    
    public static int sumCards(int[] deck) {
        int sum = 0;
        for (int i = 0; i < deck.length; i++) {
            sum += ((i + 1) % 13) * deck[i];
        }
        return sum;
    }
    
    public static void getCards(int[] deck) {
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7",
                           "8", "9", "10", "Jack", "Queen", "King" };
        System.out.println("The number of picks that yields the sum of 24: ");
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] > 0)
                System.out.print(ranks[i % 13] + " ");
        }
        System.out.println();
    }
}
