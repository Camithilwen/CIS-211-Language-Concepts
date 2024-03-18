
/**
 * Defines attributes, getters, and setters for a Scrabble tile.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Tile
{
    // instance variables
    private int point_value;
    private char letter;

    /**
     * Constructor for objects of class Tile
     */
    public Tile(char letter_input, int point_input)
    {
        // initialises instance variables
        this.point_value = point_input;
        this.letter = letter_input;
    }
    
    /**
     * Updates the character attribute of a Tile object.
     * @param letter_input inputs must be a letter.
     */
    public void setLetter(char letter_input) {
        if(java.lang.Character.isLetter(letter_input)) {
            this.letter = letter_input;
        }
        
    }
    
    /**
     * Retrieves the character attribute of a Tile object.
     * @return a character.
     */
    public char getLetter() {
        return this.letter;
    }
    
    /**
     * Sets the point value of a Tile object.
     * @param point_input inputs must be greater than 0.
     */
    public void setValue(int point_input) {
        if(point_input > 0) {
             this.point_value = point_input;
        }        
    }
    
    /**
     * Retrieves the point value of a Tile object.
     * @return an int
     */
    public int getValue() {
        return this.point_value;
    }
    
    /**
     * Formats and returns the values contained in the Tile object.
     * @return a formatted string containing the Tile object attributes.
     */
    public String printTile(){
        return String.format("Letter: %c,Value: %d", this.letter, this.point_value);
    }
    
    /**
     * Overrides the default toString method and returns the object attributes.
     * @return a short formatted string containing the Tile Object attributes.
     */
    @Override
    public String toString() {
        return String.format("%c, %d",this.letter, this.point_value); 
    }
    
    /**
     * Overrides the default equals method.
     * Point values are ignored for purposes of equality between letters.
     */
    public boolean equals(Tile that) {
        return this.letter == that.letter;
    }
    }
    

