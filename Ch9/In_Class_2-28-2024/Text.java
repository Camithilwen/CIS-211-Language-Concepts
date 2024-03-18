
/**
 * The Text class acts just like the String class.
 *
 * @author Jamie Kemman
 * @author Shepherd University
 * 
 */
import java.util.Arrays;
public class Text
{
    // instance variables - replace the example below with your own
    private char[] chars;
    private int length;

    /**
     * Constructor for objects of class Text
     */
    public Text()
    {
        // initialise instance variables
        length = 0;
        chars = new char[1000]; //TO DO: update array size based on string length to avoid nul values.
    }
    
    public char charAt(int pos) {
        //TO DO: guard against bad input in case of negatives or values larger than array size.
        return chars[pos];
        
    }
    
    public String toString() {
        
        return Arrays.toString(chars);
        
    }
    public boolean equals (Text other) {
        
        return length() == other.length();
        
    }
    
    /**
     * Adds given character to end of the text.
     * 
     * @param c One character.
     */
    public void addChar(char c) {
        
        chars[length] = c;
        length++;
        
    }
    
    
    /**
     * Returns the character count
     * 
     * @return Non-negative integer.
     */
    public int length() {
        
        return length;
        
    }
}
