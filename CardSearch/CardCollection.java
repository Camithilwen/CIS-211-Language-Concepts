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
    private int aceMode;
    private int compareMode;
    private Random randomizer;
    
    public CardCollection()
    {
        this(false, 0, 0);
    }
    /**
     * Constructor for objects of class CardCollection.
     * @param takes a boolean which initializes the deck when set true.
     * @param takes an int aceMode which is passed on to the child Card objects.
     * @param takes an int compareMode which is passed on to the child Card objects.
     */
    public CardCollection(boolean initialize, int aceMode, int compareMode) {
        this.MAX_SIZE = 52;
        this.num_cards=0;
        this.cards = new Card [MAX_SIZE];
        if(initialize) {
            for (int s=1; s<=4; s++) {
                for (int r = 1; r <= 13; r++) {
                    this.addCard(new Card(r,s, aceMode, compareMode));
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
    
    /**
     * Simple game which relies on the drawRandom() method to draw from two indexes at random and compare the results.
     * @return returns a String declaring which of the two cards is higher, or whether there is a tie.
     */
    public String gameDrawTwo() {
        int compareResult = 0;
        Card cardOne = drawRandom();
        Card cardTwo = drawRandom();
        if(cardOne != null && cardTwo != null) {
            compareResult = cardOne.compareTo(cardTwo);
        }
        if(compareResult == -1) {
                return cardTwo.toString() + " beats " + cardOne.toString();
            } else if(compareResult == 1) {
                return cardOne.toString() + " beats " + cardTwo.toString();
            } else {
                return cardOne.toString() + " ties with " + cardTwo.toString();
            }
        }
    }
    

 