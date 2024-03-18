
/**
 * Write a description of class Ex_6_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex_6_6
{
    public static void main () {
        
        main(null);
        
    }
    public static void main(String[] args) {
        String tiles = "quijibo";
        String word = "jib";
        
        canSpell(tiles, word);
        
        String tiles2 = "asdfgh";
        String word2 = "jib";
        
        canSpell(tiles2, word2);
        
        String tiles3 = "qwertyuiopasdfghjklzxcvbnm";
        String word3 = "jiib";
        
        canSpell(tiles3, word3);
    }
    public static void canSpell(String tiles, String word) {
        int letterCounter = 0;
        for (int w = 0; w < word.length(); w++) {
            char letter_for_comparison = word.charAt(w);
            for (int t = 0; t < tiles.length(); t++) {
                if(letter_for_comparison == tiles.charAt(t)) {
                System.out.println(letter_for_comparison);
                letterCounter++;
                System.out.println(letterCounter);
                    
            }
            
        }
    
        
    }
    if(letterCounter >= word.length()) {
        
        System.out.printf("The combination of tiles ''%s'' "
                            + "can spell the word ''%s''.\n", tiles, word);
        
    }
    
    else if(letterCounter != word.length()) {
        
        System.out.printf("The combination of tiles ''%s'' "
                            + "cannot spell the word ''%s''.\n", tiles, word);
        
    }
}
}

