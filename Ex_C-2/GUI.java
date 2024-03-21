import java.awt.*;
import javax.swing.JFrame;
/**
 * Control class for the Mickey Moose fractal and associated user interface.
 *
 * @author Jamie Kemman
 * @version 1.0
 * can i make a trippy button to randomize all the colors? :)
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
     * Creates a background canvas with a flow layout, defaults of size 200x200,
     * and a white background.
     * 
     */
    public void go() 
    {
        frame1.setLayout(new FlowLayout());
        canvas1.setSize(200,200);
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
    public static void main() {
        main(null);
    }
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.go();
    }
}
