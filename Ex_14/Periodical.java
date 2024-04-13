
/**
 * Extends Item() with information specific to Periodical journals and magazines.
 * @author Jamie Kemman
 * @version 1.0
 */
public class Periodical extends Item
{
    // instance variables - replace the example below with your own
    public String ISSN;
    /**
     * Constructor for objects of class Periodical
     */
    public Periodical()
    {
        super();
        ISSN = "";
    }

    /**
     * Sets the ISSN.
     * @param takes a String as input.
     */
    public void setISSN(String input) {
        ISSN = input;
    }
    
    /**
     * Retrieves the ISSN.
     * @return returns a String.
     */
    public String getISSN() {
        return ISSN;
    }
    
    /**
     * Overrides the toString() method of Item to add ISSN information to the output.
     * @return returns a human-readable String containing all Periodical attributes.
     */
    public String toString() {
        return String.format("\n[Title: %s]\n[Author(s): %s]\n[Publisher: %s]"
                            + "\n[Volume: %s]\n[Edition: %s]\n"
                            + "[Publication year: %s]\n[Call number: %s]\n"
                            + "[Format: %s]\n[Shelving location: %s]\n"
                            + "[DOI: %s]\n"
                            + "[ISSN: %s]\n",
                            title, getAuthor(), publisher, volume, edition,
                            getPublicationDate(), localCallNum,format,
                            shelvingLoc, DOI, ISSN);
    }
    
}
