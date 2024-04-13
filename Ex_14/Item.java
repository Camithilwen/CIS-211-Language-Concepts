import java.time.*;
import java.util.*;

/**
 * Absract parent class for the posible contents of a library catalog.
 * This parent class contains the bulk of the general data collected for
 * catalogued media. Child classes can and should extend with any media-specific parameters.
 * 
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public abstract class Item
{
    // instance variables
    public String title;
    public ArrayList <String> author;
    public String publisher;
    public Year publicationDate;
    public String localCallNum;
    public String DOI;
    public String volume;
    public String edition;
    public String format;
    public String shelvingLoc;
    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        // initialise instance variables
        title = "";
        this.author = new ArrayList <String>();
        publisher = "";
        this.publicationDate = Year.of(Year.MIN_VALUE);
        localCallNum = "";
        DOI = "";
        volume = "";
        edition = "";
        format = "";
        shelvingLoc = "";
    }
    
    /**
     * Sets the Item title.
     * @param takes a String as input.
     */
    public void setTitle(String input) {
        title = input;
    }
    
    /**
     * Retrieves the Item title.
     * @return returns a String.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Authors are stored in their own ArrayList, so multiple invokations of
     * setAuthor will update the list accordingly.
     * @param takes a String as input.
     */
    public void setAuthor(String input) {
        author.add(input);
    }
    
    /**
     * Retrieves the ArrayList containing all Authors.
     * @return returns the ArrayList as a String.
     */
    public String getAuthor() {
        return Arrays.deepToString(author.toArray());
    }
    
    /**
     * Sets the publisher name.
     * @param takes a String as input.
     */
    public void setPublisher(String input) {
        publisher = input;
    }
    
    /**
     * Retrieves the publisher information.
     * @return returns a String.
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * I found the Year object in JavaDoc and have implemented it here.
     * It serves no purpose as yet besides storing an integer, but
     * if I later expand this project for practice the Year object has more inherent function built in
     * than just storing a basic value.
     * @param takes an int as input.
     */
    public void setPublicationDate(int input) {
        publicationDate = Year.of(input);
    }
    
    /**
     * Retrieves the publication date.
     * @return returns a String.
     */
    public String getPublicationDate() {
        return publicationDate.toString();
    }
    
    /**
     * Setter for the physical cataloguing number of the Item.
     * @param takes a String as input. This could be changed later to a Class for the cataloguing system (e.g., LC, Dewey).
     */
    public void setLocalCallNum(String input) {
        localCallNum = input;
    }
    
    /**
     * Retrieves the physical cataloguing number.
     * @return returns a String.
     */
    public String getLocalCallNum() {
        return localCallNum;
    }
    
    /**
     * Allows entry of a Digital Object Identifier. These come in many formats, so String is probably best-suited in the long run.
     * @param takes a String as input.
     */
    public void setDOI(String input) {
        DOI = input;
    }
    
    /**
     * Retrieves the Digital Object Identifier.
     * @return returns a String.
     */
    public String getDOI() {
        return DOI;
    }
    
    /**
     * Setter for the volume number.
     * @param takes a String as input.
     */
     public void setVolume(String input) {
        volume = input;
    }
    
    /**
     * Retrieves the volume number.
     * @return returns a String.
     */
    public String getVolume() {
        return volume;
    }
    
    /**
     * Setter for the edition (e.g., 1st, 2nd)
     * @param takes a String as input.
     */
    public void setEdition(String input) {
        edition = input;
    }
    
    /**
     * Retrieves the edition.
     * @return returns a String.
     */
    public String getEdition() {
        return edition;
    }
    
    /**
     * Sets a message denoting the format type (e.g., Print, Digital)
     * @param takes a String as input.
     */
    public void setFormat(String input) {
        format = input;
    }
    
    /**
     * Retrieves the format type message.
     * @return returns a String.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * Sets a message denoting the physical shelving location in the library.
     * @param takes a String as input.
     */
    public void setShelvingLoc(String input) {
        shelvingLoc = input;
    }
    
    /**
     * Retrieves the shelving location message.
     * @return returns a String.
     */
    public String getShelvingLoc() {
        return shelvingLoc;
    }
    
    /**
     * Overrides the default toString method of Object().
     * @return returns a human-readable string containing all Item data.
     */
    public String toString() {
        return String.format("\n[Title: %s]\n[Author(s): %s]\n[Publisher: %s]\n"
                            + "[Publication year: %s]\n[Call number: %s]\n"
                            + "[Format: %s]/n[Shelving location: %s]\n"
                            + "[DOI: %s]\n",
                            title, getAuthor(), publisher,
                            getPublicationDate(), localCallNum,format,
                            shelvingLoc, DOI);
    }
    
    /**
     * Overrides the default equals method of Object().
     * @param takes a second Item or child object.
     * @return returns a boolean indicating equality based on Call Number.
     */
    public boolean equals(Item that) {
        if(this.localCallNum.equals(that.localCallNum)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Overrides the default compareTo method of Object().
     * @param takes a second Item or child object.
     * @return returns an int value indicating relative position based on Call Number.
     */
    public int compareTo(Item that) {
        return this.localCallNum.compareTo(that.localCallNum);
    }
}
