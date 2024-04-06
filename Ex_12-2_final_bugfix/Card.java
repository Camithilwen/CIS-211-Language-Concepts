
/**
 * Class defining a single playing card with elements taken from Chapter 12 of
 * the ThinkJava textbook.
 *
 * @author Jamie Kemman
 * @version 1.0
 * 
 * TODO: static setters for ace high OR ace low and compare modes
 * */
public class Card
{
    //instance variables
    private static int compareMode = 1;
    public static boolean aceMode;
    private int rank;
    private int suit;
    
    //arrays for string conversion
    public static final String[] SUITS = {null,"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
            
    //suit definitions
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;
    
    //rank definitions
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    /**
     * Constructor for a Card object. This represnts a singular playing card
     * from a traditional deck.
     * @param takes an integer encoding for rank and an integer encoding for suit.
     * @param aceMode denotes whether aces are considered high (true) or low.
     */
    public Card(int rank, int suit) {
        if (suit >= CLUBS && suit <= SPADES) {
            this.suit = suit;
        } else {
            this.suit = CLUBS;
        }
        if (rank >= ACE && rank <= KING) {
            this.rank = rank;
        } else {
            this.rank = ACE;
        }
    }

    /**
     * Replaces the default toString method.
     * @return returns a formatted String of the Card's game-relevant attributes.
     */
    public String toString() {
        String returnValue = RANKS[this.rank] + " of " + SUITS[this.suit];
        return returnValue;
    }

    /**
     * Comparison method for other Card objects.
     * @return returns 0, 1, or -1 to indicate the relative value to a second Card.
     */
    public int compareTo (Card other) {
        if (other == null) {
            return 1;
        }
        if (aceMode == true) {
            if (this.rank != ACE && other.rank == ACE) {
                return -1;
            }
            if (this.rank == ACE && other.rank != ACE) {
                return 1;
            }
        }
        if (this.rank < other.rank) {
            return -1;
        } else if (this.rank > other.rank) {
            return 1;
        } else {
            return 0;
        }     
    }

    /**
     * Replaces the default equals method.
     * @return returns a boolean indicating truth of equality.
     */
    public boolean equals (Card other) {
        if(this.rank == other.rank && this.suit == other.suit) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Setter for the game-relevant value of Aces.
     * Allows aces high, low, or wild to be updated as needed.
     * @param takes an integer between 0 and 2.
     */
    public static void setAceMode(boolean setting) {
        aceMode = setting;
    }

    /**
     * Getter for the setting controlling the rank value of Aces.
     * @return returns an int between 0 and 2. 0 = ACEMODELOW, 1 = ACEMODEHIGH, 2 = ACEMODEBOTH.
     */
    public boolean getAceMode() {
        return this.aceMode;
    }
}
