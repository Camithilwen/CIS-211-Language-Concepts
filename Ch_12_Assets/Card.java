
/**
 * Class defining a single playing card,taken from Chapter 12 of
 * the ThinkJava textbook.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Card
{
    //instance variables
    private int rank;
    private int suit;
    
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
        this.rank = rank;
        this.suit = suit;
    }
    public String toString() {
        String[] suits = {null,"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                            "10", "Jack", "Queen", "King"};
        String returnValue = ranks[this.rank] + " of " + suits[this.suit];
        return returnValue;
    }
}
