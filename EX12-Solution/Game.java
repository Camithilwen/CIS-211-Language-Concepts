import java.util.Random;
/**
 * This HW is an extension of exercise 12-2 which addresses 
 * whether ace is high or low. Some people think ace is 
 * lower than two, but others think ace is higher than king. 
 * Our software should support both. In the game War, cards 
 * are compared by rank not suit. Write a program that 
 * announces "Ace is low!", then generates 20 pairs of 
 * random cards, and announces each pair's winner, as in 
 * "4 beats 3" or "3 beats A". Then, it announces "Ace is high!", 
 * generates 20 more pairs, and announces those winners, as in 
 * "A beats Q". Critically, all comparisons must use compareTo(), 
 * as in cmp=card1.compareTo(card2). Hint: your Card class 
 * needs a static boolean attribute to represent whether ace 
 * is high, and compareTo() needs to use this attribute.
 *
 * @author Jason Miller
 * @version 0.1
 */
public class Game {

    public static void main () {
        main(null);
    }

    public static void main (String [] args) {
        Card card1 = new Card(Card.ACE, Card.HEARTS); 
        Card card2 = new Card(Card.KING, Card.HEARTS); 
        System.out.println("Initial test, verify ace is low.");
        Card.setAceHigh(false);
        chooseWinner(card1,card2);
        System.out.println("Initial test, verify ace is high.");
        Card.setAceHigh(true);
        chooseWinner(card1,card2);
        
        System.out.println("\nStart the game.");
        System.out.println("\nAce is low!");
        Card.setAceHigh(false);
        showOff();

        System.out.println("\nAce is high!"); // bug fix
        Card.setAceHigh(true);
        showOff();
    }

    /**
     * Compare 20 cards.
     * Use the random number generator from ThinkJava chapter 7.
     * 
     * In this minimimalist solution,
     * each card becomes garbage immediately after the comparison.
     * Another soultion could use two CardCollection instances,
     * with each one holding a full deck of 52 cards, from which 
     * we compare a random card from each ... 20 times.
     */
    public static void showOff () {
        int NUM_PAIRS=20;
        int RANKS = 13;
        int SUITS = 4;
        int rank;
        int suit;
        Card card1, card2;
        Card [] player1 = new Card [NUM_PAIRS];
        Card [] player2 = new Card [NUM_PAIRS];        
        Random generator = new Random();
        for (int i=0; i<NUM_PAIRS; i++) {
            rank = generator.nextInt(RANKS)+1;
            suit = generator.nextInt(SUITS)+1;
            card1 = new Card(rank,suit);
            rank = generator.nextInt(RANKS)+1;
            suit = generator.nextInt(SUITS)+1;
            card2 = new Card(rank,suit);
            chooseWinner (card1,card2);
        }
    }

    public static void chooseWinner (Card card1, Card card2) {
        int cmp = card1.compareTo(card2);
        if (cmp==0) {
            System.out.println(card1 + " tied " + card2);
        }
        else if (cmp>0) {
            System.out.println(card1 + " beat " + card2);
        }
        else {
            System.out.println(card1 + " lost to " + card2);
        }
    }
}

