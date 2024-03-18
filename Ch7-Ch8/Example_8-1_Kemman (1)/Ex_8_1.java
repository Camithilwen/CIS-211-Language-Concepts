
/**
 * Example 8-1 from the Think Java textbook.
 *
 * @author Jamie Kemman
 * @version V1.0
 * 
 *This program is a recursive generation of the beer bottle song.
 *I have left versecount defaulted at 99.
 *Program developed with versecount at 3.
 *After debugging and proving the program works at versecount 99,
 *I changed versecount to 10000. The program ran down through verse 429 before
 *encountering stack overflow. On subsequent re-runs it made it 10000 verses without
 *exception.
 */
public class Ex_8_1
{
    
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args) {
        
        int versecount = 99; //initial count of song verses.
        
        String firstVerse = verseFormat(versecount); //initial call for method to format the individual song verses.
        
        System.out.println(firstVerse); //i just used a print line here since the string is already formatted.
               
        versecount--; //decrements versecount in preparation for the body of the song.
        
        mainVerses(versecount);  //calls the recursive routine.
        
    }
    
    public static String verseFormat(int versecount) { //verse formatting method.
        
        if(versecount > 1){
            
            String verse = String.format("%d bottles of beer on the wall,\n" +
                                       "%d bottles of beer,\n" +
                                        "ya' take one down, ya' pass it around,\n"+
                                        "%d bottles of beer on the wall!\n\n\n",
                                        versecount, versecount, versecount - 1); //formats the song verse with current verse count as a single string.
            return verse;
        }
        
        else if (versecount == 1) { //I know this makes the program longer, but the extraneous plural s on a singular bottle was bothering me, so i wrote a condition for it.
            
            String verse = String.format("%d bottle of beer on the wall,\n" +
                                       "%d bottle of beer,\n" +
                                        "ya' take it down, ya' pass it around,\n"+
                                        "last bottle of beer on the wall!\n\n\n",
                                        versecount, versecount);
        
            return verse;
    }
    return null;
    }
    
    public static void mainVerses(int versecount) { //recursive method.
        
        if (versecount > 0) {
            
            String mainVerse = verseFormat(versecount);
            System.out.println(mainVerse);
            versecount--;
            mainVerses(versecount);
            
        }
        
        else if (versecount == 0) {
            
            endVerse(); //calls a specific method for the final verse, as it contains no integer variables.
        }
        
    }
    
    public static void endVerse() { //method defining the final verse.
        
        System.out.printf("No bottles of beer on the wall,\n" +
                            "no bottles of beer,\n"+
                            "ya' can't take one down, ya' can't pass it around,\n"+
                            "no bottles of beer on the wall!\n\n\n"); //i just used a printf instead of creating a formatted string since it will only be called once.
        
    }
    }

