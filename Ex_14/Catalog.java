import java.util.*;

/**
 * ArrayList catalog for Item objects.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Catalog
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> contents;

    /**
     * Constructor for objects of class Catalog
     */
    public Catalog()
    {
        // initialise instance variables
        this.contents = new ArrayList<Item>();
    }

    public void addItem(Item input) {
        this.contents.add(input);
    }
    
    public void removeItem(int index) {
        this.contents.remove(index);
    }
    
    public Item getItem(int index) {
        return this.contents.get(index);
    }
    
    public String toString() {
        return Arrays.deepToString(contents.toArray());
    }
}
