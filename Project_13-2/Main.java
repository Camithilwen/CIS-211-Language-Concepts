import java.util.Random;
/**
 * Simple card game exercise using Card objects.
 * @author Jamie Kemman
 * @version 1.0
 */
public class Main {
    public static void main () {
        main(null);
    }

    public static void main (String[] args) {
        CardCollection testDeck = new CardCollection(true, true, 52);
        System.out.printf("Before:\n" + testDeck.print() + "\n\n");
        System.out.printf("Shuffle time!\n\n");
        testDeck.shuffle(3);
        System.out.printf("After:\n" + testDeck.print() + "\n\n");
        System.out.printf("Sorting time!\n\n");
        testDeck.selectionSort();
        System.out.printf("Sorted:\n" + testDeck.print() + "\n\n");
        System.out.printf("Shuffle again!\n\n");
        testDeck.shuffle(3);
        System.out.printf(testDeck.print() + "\n\n");
        CardCollection mergeDeck = testDeck.mergeSort(testDeck);
        System.out.printf("\n\nMerge sorted:\n" + mergeDeck.print() + "\n\n");
    }
}
        
