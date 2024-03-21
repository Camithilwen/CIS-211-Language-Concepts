import java.awt.*;
import java.util.Random;
/**
 * Using material and inference taken from the Think Java textbook,
 * this class extends java.awt.Color to provide an option for a
 * randomized return.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class randomColor

{
    // instance variables - replace the example below with your own
    Color colorValue;
    Random randomizer;
    /**
     * Constructor for objects of class RandomColor
     */
    public void randomColor()
    {
        randomizer = new Random();
        this.colorValue = new Color(randomizer.nextInt(255), randomizer.nextInt(255), randomizer.nextInt(255));
    }
    /**
     * Getter for the randomzied Color.
     * @return returns a Color object.
     */
    public Color getColor() {
        
        return this.colorValue;
        
    }
}
