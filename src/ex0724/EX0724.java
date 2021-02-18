package ex0724;



/**
 *
 * @author kristiyan
 */
public class EX0724 {
    /** Main method. */
    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] pick = new int[4];
        String[] ranks = { "Ace", "2", "Three", "Four", "Five",
                         "Six", "Seven", "Eight", "Nine", "Ten",
                          "Jack", "Queen", "King" };
        String[] suits = { "Diamonds", "Hearts", "Spades", "Clubs" };
        int count = 0;
        
        
        
        isShuffle(deck);
        
        do {
            pickCards(deck, pick);
            count++;
        } while (!isPicked(pick));
        generateCards(ranks, suits, deck);
        System.out.println("Number of picks: " + count);
    }
    
    public static void pickCards(int[] deck, int[] pick) {
        for (int i = 0; i < pick.length; i++) {
            pick[i] = (int) Math.random() * deck.length;
            pick[i] = deck[pick[i]];
        }
    }
    
    /** Method to shuffle the cards. */ 
    public static boolean isShuffle(int[] deck) {
        boolean isShuffled = false;
        for (int i = 0; i < deck.length; i++) {
            int index = (int)Math.random() * deck.length;
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            isShuffled = true;
        }
        return isShuffled;
    }
    
    /** Method to generate 52 cards. */
    public static void generateCards(String[] ranks, String[] suits, int[] deck) {
        int[] pick = new int[4];
        for (int i = 0; i < 4; i++) {
            int cardNumber = (int) Math.random() * deck.length;
            System.out.println(ranks[pick[i] % 13] + " of " + suits[pick[i] / 13]);
        }
    }
    
    public static boolean isPicked(int[] pick) {
        for (int i = 0; i < pick.length; i++) {
            for (int j = 0; i < pick.length; j++) {
                if (i != j && (pick[j] /13 == pick[i] / 13))
                    return false;
            }
        }
        return true;
    }
}
