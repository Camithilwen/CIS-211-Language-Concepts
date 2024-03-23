import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Defines a drawing canvas and associated elements for creating a fractal moose.
 * @author Jamie Kemman
 * @version 1.0
 */
public class MyCanvas
extends Canvas
{
    // instance variables - replace the example below with your own
    Color mooseColor;
    Rectangle bigMoose = new Rectangle(75, 150, 150, 150);
    boolean recursiveColor;
    
    /**
     * Sets the color of the Moose.
     * @param takes a Color.
     */
    public void setColor (Color mooseColor) {
        this.mooseColor = mooseColor;
        
    }
    /**
     * Method for defining a circle or oval using a rectangle object as a bounding box.
     * @param takes a Graphics object and a Rectangle.
     */
    public void boxOval(Graphics g, Rectangle boundingBox) {
        g.fillOval(boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);
    }
    /**
     * Recieves a boolean setting flag from the gui for recursive color randomization.
     * @param Takes a boolean.
     */
    public void recursiveColor(boolean flag) {
        if(flag == true) {
            this.recursiveColor = true;
        }
        else if(flag == false) {
            this.recursiveColor = false;
        }
    }
    /**
     * When invoked, generates a new random color using the a randomColor object.
     * @return Returns a Color.
     */
    public Color colorCall() {
        randomColor recursive = new randomColor();
        return recursive.randomColor();
    }
    /**
     * When invoked by a paint object, this method creates a fractalized
     * mickey mouse head dubbed 'mickey moose'. 
     * @param Takes a Graphics object and a Rectangle.
     */
    public void mooseHead(Graphics g, Rectangle boundingBox) {
        boxOval(g, boundingBox);
        int halfX = boundingBox.width/2;
        int halfY = boundingBox.height/2;
        Rectangle halfBox = new Rectangle(boundingBox.x, boundingBox.y, halfX, halfY);
        halfBox.translate(-halfX / 2, -halfY / 2);
        if(boundingBox.width >=3 && boundingBox.height >=3) {
            if(this.recursiveColor == true) {
               g.setColor(colorCall()); 
            }
            else if(this.recursiveColor == false) {
                g.setColor(mooseColor);
            }
            mooseHead(g, halfBox); }
        halfBox.translate(halfX * 2, 0);
        if(boundingBox.width >=3 && boundingBox.height >=3) {
            if(this.recursiveColor == true) {
               g.setColor(colorCall()); 
            }
            else if(this.recursiveColor == false) {
                g.setColor(mooseColor);
            }
            mooseHead(g, halfBox); }
        }
    /**
     * Paint method for drawing to the canvas.
     * @param  takes a Graphics object.
     */
    public void paint(Graphics g) 
    {
        g.setColor(mooseColor);
        mooseHead(g, bigMoose);
    } 
    }
