import java.util.Random;
/**
 * Simple card game exercise using Card objects.
 * @author Jamie Kemman
 * @version 1.0
 */
public class Game {
    public static void main () {
        main(null);
    }

    public static void main (String[] args) {
        compareTwoCards();
    }

    /**
     * Simple game comparing pairs of randomized cards.
     * Repeats twenty times each for aces low and aces high.
     */
    public static void compareTwoCards() {
        CardCollection deckOne = new CardCollection(true, false);
        System.out.println("Aces low!");
        for (int i = 0; i < 20; i++) {
            System.out.println(gameDrawTwo(deckOne));
        }
        
        System.out.println();
        CardCollection deckTwo = new CardCollection(true, true);
        System.out.println("Aces high!");
        for (int j = 0; j < 20; j++) {
            System.out.println(gameDrawTwo(deckTwo));
        }
    }
    /**
     * Simple game which relies on the drawRandom() method to draw from two indexes at random and compare the results.
     * @return returns a String declaring which of the two cards is higher, or whether there is a tie.
     */
    public static String gameDrawTwo(CardCollection inputDeck) {
        int compareResult = 0;
        Card cardOne = inputDeck.drawRandom();
        Card cardTwo = inputDeck.drawRandom();
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
        
