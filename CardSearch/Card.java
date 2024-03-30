
/**
 * Class defining a single playing card with elements taken from Chapter 12 of
 * the ThinkJava textbook.
 *
 * @author Jamie Kemman
 * @version 1.0
 * */
public class Card
{
    //instance variables
    
    //general instance variables
    private int rank;
    private int suit;
    private int rankMin;
    private int rankMax;
    private static int aceMode;
    private static int compareMode;
    public static final int ACEMODELOW = 0;
    public static final int ACEMODEHIGH = 1;
    public static final int ACEMODEBOTH = 2;
    public static final int COMPAREMODESUIT = 0;
    public static final int COMPAREMODERANK = 1;
    public static final int COMPAREMODEBOTH = 2;
    
    //arrays for string conversion
    public static final String[] SUITS = {null,"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace"};
            
    //suit definitions
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;
    
    //rank definitions
    public static final int ACELOW = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACEHIGH = 14;
    
    /**
     * Constructor for a Card object. This represnts a singular playing card
     * from a traditional deck.
     * @param takes an integer encoding for rank and an integer encoding for suit.
     * @param Encoding is described in the Constructor documentation.
     * @param aceMode denotes aces low (0), aces high (1), or aces wild (2). Default on invalid input is aces high.
     * @param compareMode denotes suit priority (0), rank priority (1), or both (2). Default on invalid input is rank priority.
     * 
     * Rank and Suit encoding is as follows:
     * 
     * Rank
     *  Ace (low) -> 1
     *  . . .
     *  King -> 13
     *  Ace (high) -> 14
     * 
     * Suit
     *  Clubs -> 1
     *  Diamonds -> 2
     *  Hearts -> 3
     *  Spades -> 4
     */
    public Card(int rank, int suit, int aceMode, int compareMode) {
        if(aceMode >= ACEMODELOW && aceMode <= ACEMODEBOTH) {
            this.aceMode = aceMode; 
        } else {
            this.aceMode = ACEMODEHIGH;
        }
        if(compareMode >= COMPAREMODESUIT && compareMode <= COMPAREMODEBOTH) {
            this.compareMode = compareMode;
        } else {
            this.compareMode = COMPAREMODERANK;
        }
        if (this.aceMode == ACEMODEHIGH || this.aceMode == ACEMODEBOTH) {
            rankMin = 2;
            rankMax = ACEHIGH;
            if(this.rank == ACELOW) {
                this.rank = ACEHIGH;
            }
        } else if (this.aceMode == ACEMODELOW) {
            rankMin = ACELOW;
            rankMax = KING;
            if (this.rank == ACEHIGH) {
                this.rank = ACELOW;
            }
        } 
        if (suit >= CLUBS && suit < SPADES) {
            this.suit = suit;
        } else {
            this.suit = CLUBS;
        }
        if (rank >= rankMin && rank <= rankMax) {
            this.rank = rank;
        } else {
            this.rank = 2;
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
     * Comparison mechanics are determined by the value of compareMode.
     * @return returns 0, 1, or -1 to indicate the relative value to a second Card.
     */
    public int compareTo (Card other) {
        if (other == null) {
            return 1;
        }
        if (this.rank < other.rank && (compareMode != COMPAREMODESUIT)) {
            return -1;
        } else if (this.rank > other.rank && (compareMode != COMPAREMODESUIT)) {
            return 1;
        } else if (this.suit < other.suit && (compareMode != COMPAREMODERANK)) {
            return -1;
        } else if (this.suit > other.suit && (compareMode != COMPAREMODERANK)) {
            return 1;
        } else {
            return 0;
        }     
    }

    /**
     * Replaces the default equals method.
     * Equality mechanics are determined by the value of compareMode.
     * @return returns a boolean indicating truth of equality.
     */
    public boolean equals (Card other) {
        if(compareMode == COMPAREMODESUIT) {
            return this.suit == other.suit;
        } else if(compareMode == COMPAREMODERANK) {
            return this.rank == other.rank;
        } else if(compareMode == COMPAREMODEBOTH) {   
            return this.suit==other.suit &&
            this.rank==other.rank;
        } else {
            return false;
        }
    }

    /**
     * Setter for the game-relevant value of Aces.
     * Allows aces high, low, or wild to be updated as needed.
     * @param takes an integer between 0 and 2.
     */
    public void setAceMode(int setting) {
        if(setting >= ACEMODELOW && setting <= ACEMODEBOTH) {
            this.aceMode = setting;
        } else {
            this.aceMode = ACEMODEHIGH;
        }
    }

    /**
     * Getter for the setting controlling the rank value of Aces.
     * @return returns an int between 0 and 2. 0 = ACEMODELOW, 1 = ACEMODEHIGH, 2 = ACEMODEBOTH.
     */
    public int getAceMode() {
        return this.aceMode;
    }

    /**
     * Setter for the comparison mode. Allows basis of comparison to be actively changed between suit, rank, or both.
     * @param takes an int between 0 and 2.
     */
    public void setCompareMode(int setting) {
        if(setting >= COMPAREMODESUIT && setting <= COMPAREMODEBOTH) {
            this.compareMode = setting;
        } else {
            this.compareMode = COMPAREMODERANK;
        }
    }

    /**
     * Getter for the comparsion mode setting.
     * @return returns an int between 0 and 2. 0 == COMPAREMODESUIT, 1 = COMPAREMODERANK, 2 = COMPAREMODEBOTH.
     */
    public int getCompareMode(int setting) {
        return this.compareMode; 
    }
}
