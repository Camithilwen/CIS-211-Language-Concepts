import java.awt.*;
import javax.swing.JFrame;
/**
 * Control class for the Mickey Moose fractal and associated user interface.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class GUI
{
    // instance variables - replace the example below with your own
    JFrame frame1;
    MyCanvas canvas1;
    MyButtons buttons;
    MyMenu menu1;

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        frame1 = new JFrame();
        canvas1 = new MyCanvas();
        buttons = new MyButtons(this);
        menu1 = new MyMenu(this);
    }
    /**
     * Creates a background canvas with a flow layout, defaults of size 300x300,
     * and a white background.
     */
    public void go() 
    {
        frame1.setLayout(new FlowLayout());
        canvas1.setSize(300,300);
        canvas1.setBackground(Color.WHITE);
        frame1.setMenuBar(menu1);
        frame1.add(canvas1);
        frame1.add(buttons);
        frame1.pack();
        frame1.setVisible(true);
    }
    /**
     * Setter for the Moose's color.
     * @param takes a color value.
     */
    public void setColor (Color mooseColor) {
        canvas1.setColor(mooseColor);
        canvas1.repaint();
    }
    /**
     * Setter for the canvas's background color.
     * @param takes a color value.
     */
    public void setBackground(Color c) {
        canvas1.setBackground(c);
    }
    /**
     * Passes a boolean flag from an event manager to a canvas class.
     * @param Takes a boolean.
     */
    public void setRecursiveColor(boolean flag) {
        if(flag == true) {
            canvas1.recursiveColor(true);   
        }
        else if(flag == false) {
           canvas1.recursiveColor(false); 
        }
    }
    public static void main() {
        main(null);
    }
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.go();
    }
    }

