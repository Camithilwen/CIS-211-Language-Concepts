import java.util.Arrays;
import java.util.Random;
/**
 * Defines a deck of Card objects.
 * Containes methods for drawing a random card and a simple game
 * of drawing and comparing two random cards.
 *
 * @author Jamie Kemman
 * @version 1.1
 */
public class CardCollection
{
    // instance variables
    public Card[] cards; //TODO: re-privatize
    private int MAX_SIZE;
    private int num_cards;
    private boolean aceMode;
    private static Random randomizer = new Random();
    public int length;
    
    public CardCollection()
    {
        this(false, true, 0);
    }
    /**
     * Constructor for objects of class CardCollection.
     * @param takes a boolean which initializes the deck when set true.
     * @param takes an int aceMode which is passed on to the child Card objects.
     */
    public CardCollection(boolean initialize, boolean aceMode, int size) {
        this.aceMode = aceMode;
        this.MAX_SIZE = size;
        this.num_cards=0;
        this.cards = new Card [MAX_SIZE];
        Card.setAceMode(this.aceMode);
        if(initialize) {
                for (int s=1; s<5; s++) {
                for (int r = 1; r <= 13; r++) {
                    this.addCard(new Card(r,s));
                }
            }
            }
        this.length = cards.length;
            }
    
    /**
     * Draws a random card. Size of the random number generation corresponds to the amount of array indexes.
     * TODO (later, for practice): change this so when a random card is drawn, that index is withdrawn from the deck and cannot be drawn again.
     * @return returns a Card object.
     */
    public Card drawRandom() {
        return this.cards[randomInt(1, MAX_SIZE)];
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
        return Arrays.deepToString(cards);
    }
    
    /**
     * Generates a random integer value within a given range.
     * @param takes two integers to describe the range.
     * @return returns a random integer from within the range.
     */
    private static int randomInt(int low, int high) {
        return randomizer.nextInt(high - low + 1);
    }
    
    /**
     * Swaps two cards of given positions.
     * @param takes two integers equal to the array indexes of the desired cards.
     */
    private void swapCards(int one, int two) {
        Card temp = this.cards[one];
        this.cards[one] = this.cards[two];
        this.cards[two] = temp;
    }
    
    /**
     * Randomly shuffles the deck when invoked.
     * @param Takes an integer value to allow for consecutive shuffles.
     * */
    public void shuffle(int repeat) {
        /* 
         * I noticed a problem with the first card in the shuffled array remaining the same
         * as the final card in the unshuffled array through consecutive re-runs of the program.
         * Adding a second loop seems to have fixed the bug and provided more randomized results.
        */
        for(int j = 0; j < repeat; j++) {
            for(int i = 0; i < cards.length; i++) {
            swapCards(i, randomInt(i, cards.length - 1));
            }
        }
    }
    
    /**
     * Formats the deck into a human readable text block.
     * @return Returns a formatted string of the deck contents.
     */
    public String print() {
        String output = "";
        int j = 0;
        for(int i = 0; i < cards.length; i++) {
            output = (output + " " + "[" + cards[i].toString() + "]" + " ");
            j++;
            if(j == 4) {
                output = (output + "\n");
                j = 0;
            }
        }
        return output;
    }
    
    public void mergeSort() {
        Card[] half = new Card[(MAX_SIZE / 2)];
    }
    
    public CardCollection subdeck(int low, int high) {
        CardCollection sub = new CardCollection(false, this.aceMode, high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }
    
    public void selectionSort() {
        int lowest;
        for(int i = 0; i < this.cards.length; i++) {
            lowest = this.indexLowest(i,this.MAX_SIZE);
            this.swapCards(i, lowest);
            }
    }
    
    public int indexLowest(int low, int high) { //TODO: re-privatize.
        int lowest = low;
        int lowestToRight = low;
        Card lowestCard = this.cards[low];
        Card lowestCardToRight = this.cards[low];
        for(int i = low; i < high - 1; i++) {
                if(lowestCard.multiCompare(this.cards[i+1]) == 1) {
                    lowestToRight = i+1;
                    lowestCardToRight = this.cards[i+1];
                }
                if(lowestCard.multiCompare(lowestCardToRight) == 1) {
                    lowest = lowestToRight;
                    lowestCard = lowestCardToRight;
                }
        }
        return lowest;
    }
    private static CardCollection merge(CardCollection deck1, CardCollection deck2) {
        CardCollection deck3 = new CardCollection(false, true, deck1.length + deck2.length);
        int i = 0;
        int j = 0;
        for(int k = 0; k < deck3.length; k++) {
            if(deck1.cards[i] == null) {
                deck3.cards[k] = deck2.cards[j];
                j++;
            }
            if(deck2.cards[j] == null) {
                deck3.cards[k] = deck1.cards[i];
                i++;
            }
            else{
                switch (deck1.cards[i].multiCompare(deck2.cards[j])) {
                    case -1:
                        deck3.cards[k] = deck2.cards[j];
                        j++;
                        break;
                    case 0:
                        deck3.cards[k] = deck1.cards[i];
                        i++;
                        break;
                    case 1:
                        deck3.cards[k] = deck1.cards[i];
                        i++;
                        break;
                    default:
                        deck3.cards[k] = deck1.cards[i];
                        i++;
                        break;
                }
            }
        }
        return deck3;
    }
}

    

 