import java.awt.*;
/**
 * Write a description of class MyCanvas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyCanvas
extends Canvas
{
    // instance variables - replace the example below with your own
    Color mooseColor;
    /**
     * Sets the color of the Moose.
     * @param takes a Color.
     */
    public void setColor (Color mooseColor) {
        this.mooseColor = mooseColor;
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void paint(Graphics g) 
    {
        g.setColor(mooseColor);
        
    }
}
