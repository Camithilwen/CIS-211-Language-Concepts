import java.awt.*;
import java.util.Random;
/**
 * Using material and inference taken from the Think Java textbook,
 * this class provides an option for a Color with randomized RGBA values.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class randomColor

{
    // instance variables
    Random randomizer = new Random();
    int r = randomizer.nextInt(255);
    int g = randomizer.nextInt(255);
    int b = randomizer.nextInt(255);
    int a = randomizer.nextInt(255);
    /**
     * Constructor for objects of class RandomColor
     */
    public Color randomColor()
    {
        Color colorReturn = new Color(this.r,this.g,this.b,this.a); //i found out about the alpha variable by reading the javadoc inside blueJ.
        return colorReturn;
    }
}
