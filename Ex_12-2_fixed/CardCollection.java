import java.util.Arrays;
import java.util.Random;
/**
 * Defines a deck of Card objects.
 * Containes methods for drawing a random card and a simple game
 * of drawing and comparing two random cards.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class CardCollection
{
    // instance variables - replace the example below with your own
    private Card[] cards;
    private int MAX_SIZE;
    private int num_cards;
    private boolean aceMode;
    private Random randomizer;
    
    public CardCollection()
    {
        this(false, true);
    }
    /**
     * Constructor for objects of class CardCollection.
     * @param takes a boolean which initializes the deck when set true.
     * @param takes an int aceMode which is passed on to the child Card objects.
     */
    public CardCollection(boolean initialize, boolean aceMode) {
        this.aceMode = aceMode;
        this.MAX_SIZE = 52;
        this.num_cards=0;
        this.cards = new Card [MAX_SIZE];
        Card.setAceMode(this.aceMode);
        if(initialize) {
                for (int s=1; s<6; s++) {
                for (int r = 1; r <= 13; r++) {
                    this.addCard(new Card(r,s));
                }
            }
            }
            }
    
    /**
     * Draws a random card. Size of the random number generation corresponds to the amount of array indexes.
     * TODO (later, for practice): change this so when a random card is drawn, that index is withdrawn from the deck and cannot be drawn again.
     * @return returns a Card object.
     */
    public Card drawRandom() {
        randomizer = new Random();
        return this.cards[randomizer.nextInt(MAX_SIZE)];
    }

    /**
     * Getter for the size of the deck in Cards.
     */
    public int getCount() {
        return num_cards;
    }

    /**
     * Setter for adding additional Card objects to the deck.
     * @param Takes a Card object.
     */
    public void addCard(Card c) {
        if(num_cards < MAX_SIZE && c != null) {
            cards[num_cards]=c;
            num_cards++;
        }
    }
    
    /**
     * Replaces the default toString method and prints the array of Cards.
     * @return returns a String containing every array element.
     */
    public String toString(){
        return Arrays.toString(cards);
    }
    }
    

 