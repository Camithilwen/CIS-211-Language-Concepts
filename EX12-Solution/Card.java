/**
 * Represent one card from a card game.
 * Essential attributes are rank and suit.
 * 
 * @version Developed in class week of Mar 25 2024.
 */
public class Card {
    // essential instance variables
    // private for information hiding
    private int suit;
    private int rank;
    
    // class variable controls ace rule
    private static boolean ACE_HIGH = false;
    
    // private variables for internal use
    // as class variables, one copy is shared by all instances
    private static String SUITS = "CDHS";
    private static String RANKS = "A23456789TJQK";
    
    // help other programs to define specific cards
    public static int SPADES = 4;
    public static int HEARTS = 3;
    public static int DIAMONDS = 2;
    public static int CLUBS = 1;
    public static int ACE = 1;
    public static int JACK = 11;
    public static int QUEEN = 12;
    public static int KING = 13;
    
    /**
     * Constructor.
     * Calling programs may use constants like this:
     * Card c = new Card (Card.ACE, Card.SPADES);
     * Edge case behavior: generates default card if given invalid.
     * Default card is ace of spades.
     * 
     * @param rank 1 for ace, 2 for 2, .... 13 for king
     * @param suit {1,2,3,4} for {clubs,diamonds,hearts,spades}
     */
    public Card (int rank, int suit) {
        if (suit>0 && suit<=4) {
            this.suit = suit-1;  // internally, use zero-based index
        } else {
            this.suit = 0; // default spades
        }
        if (rank>0 && suit<=13) {
            this.rank = rank-1;  // internally, use zero-based index
        } else {
            this.rank = 0;  // default ace
        }
    }
    
    public String toString () {
        char s = SUITS.charAt(this.suit);
        char r = RANKS.charAt(this.rank);
        return "["+r+s+"]";
    }
    
    public boolean equals (Card other) {
        return this.suit==other.suit &&
        this.rank==other.rank;
    }
    
    /**
     * Determine the ace rule for all cards.
     * This affects the compareTo() results.
     * Default: ace is lower than two.
     * 
     * @param aceIsHigh If true, ace is higher than king.
     */
    public static void setAceHigh (boolean aceIsHigh) {
        ACE_HIGH = aceIsHigh;
    }
    
    /**
     * Compare cards and return 0, negative, or positive.
     * 
     * @see setAceHigh
     */
    public int compareTo (Card other) {
        if (other == null) {
            return 1;
        }
        if (ACE_HIGH) {
            int ace = 0;  // internally, ace is zero
            // special case: either card is an ace, but not both
            if (this.rank != ace && other.rank == ace) {
                return -1;
            }
            if (this.rank == ace && other.rank != ace) {
                return 1;
            }
            // else regular rules apply
        }
        if (this.rank<other.rank) {
            return -1;
        } else if (this.rank>other.rank) {
            return 1;
        } else if (this.suit<other.suit) {
            return -1;
        } else if (this.suit>other.suit) {
            return 1;
        } 
        return 0;
    }
}
