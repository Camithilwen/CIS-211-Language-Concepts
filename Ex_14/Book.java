
/**
 * Extends Item() to include additional data specific to print and digital books.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Book extends Item
{
    // instance variables - replace the example below with your own
    public String ISBN_10;
    public String ISBN_13;
    public int authorCount = 1;
    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        super();
        ISBN_10 = "";
        ISBN_13 = "";
    }

    /**
     * Setter for the ISBN. ISBN formats are automatically filtered.
     * If both exist, ISBN-10 and ISBN-13 can be entered through separate invocations.
     * @param takes a String as input.
     */
    public void setISBN(String input) {
        if(input.length() == 10) {
            ISBN_10 = input;
        } else if(input.length() == 13) {
            ISBN_13 = input;
        } else {
            System.err.println("Invalid ISBN.");
        }
    }
    
    /**
     * Retrieves associated ISBNs.
     * @return returns a human-readable String containing the ISBN-10 and/or ISBN-13.
     */
    public String getISBN() {
        if(!(ISBN_10.isEmpty()) && ISBN_13.isEmpty()) {
            return String.format("\n[ISBN-10: %s]\n",ISBN_10);
        } else if(!(ISBN_13.isEmpty()) && ISBN_10.isEmpty()) {
            return String.format("\n[ISBN-13: %s]\n",ISBN_13);
        } else if(!(ISBN_10.isEmpty()) && !(ISBN_13.isEmpty())) {
            return String.format("\n[ISBN-10: %s]\n[ISBN-13: %s]\n",ISBN_10,ISBN_13);
        } else {
            return "";
        }
    }
    
    /**
     * Overrides the toString() method of Item to add ISBN information to the output.
     * @return returns a human-readable String of all Book attributes.
     */
    public String toString() {
        return String.format("\n[Title: %s]\n[Author(s): %s]\n[Publisher: %s]"
                            + "\n[Volume: %s]\n[Edition: %s]\n"
                            + "[Publication year: %s]\n[Call number: %s]\n"
                            + "[Format: %s]\n[Shelving location: %s]\n"
                            + "[DOI: %s]\n",
                            title, getAuthor(), publisher, volume, edition,
                            getPublicationDate(), localCallNum, format, shelvingLoc,DOI
                            + getISBN());
    }
    
}
