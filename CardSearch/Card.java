
/**
 * Class defining a single playing card,taken from Chapter 12 of
 * the ThinkJava textbook.
 *
 * @author Jamie Kemman
 * @version 1.0
 * 
 * TODO: write differentiation into the class where aces can be low, high, or both.
 * (HW only requires switching between low or high)
 */
public class Card
{
    //instance variables
    private int rank;
    private int suit;
    public static final String[] SUITS = {null,"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                            "10", "Jack", "Queen", "King"};
                            
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;
    
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    /**
     * Constructor for a Card object. This represnts a singular playing card
     * from a traditional deck.
     * @param takes an integer encoding for rank and an integer encoding for suit.
     * @param Encoding is described in the Constructor documentation.
     * 
     * Encoding is as follows:
     * 
     * Rank
     *  Ace -> 1
     *  . . .
     *  King -> 13
     * 
     * Suit
     *  Clubs -> 1
     *  Diamonds -> 2
     *  Hearts -> 3
     *  Spades -> 4
     */
    public Card(int rank, int suit) {
        if (suit >= 1 && suit < 5) {
            this.suit = suit;
        } else {
            this.suit = 1;
        }
        if (rank >= 1 && rank < 14) {
            this.rank = rank;
        } else {
            this.rank = 1;
        }
    }
    public String toString() {
        String returnValue = RANKS[this.rank] + " of " + SUITS[this.suit];
        return returnValue;
    }
    public int compareTo (Card other) {
        if (other == null) {
            return 1;
        }
        if (this.rank < other.rank) {
            return -1;
        } else if (this.rank > other.rank) {
            return 1;
        } else if (this.suit < other.suit) {
            return -1;
        } else if (this.suit > other.suit) {
            return 1;
        }
        return 0;
    }
    public boolean equals (Card other) {
        return this.suit==other.suit &&
        this.rank==other.rank;
    }
}
