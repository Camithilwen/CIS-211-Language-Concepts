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
        CardCollection deckOne = new CardCollection(true, Card.ACEMODELOW, Card.COMPAREMODERANK);
        System.out.println("Aces low!");
        for (int i = 0; i < 20; i++) {
            System.out.println(deckOne.gameDrawTwo());
        }
        
        System.out.println();
        
        CardCollection deckTwo = new CardCollection(true, Card.ACEMODEHIGH, Card.COMPAREMODERANK);
        System.out.println("Aces high!");
        for (int j = 0; j < 20; j++) {
            System.out.println(deckTwo.gameDrawTwo());
        }
    }
}
        
