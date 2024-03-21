import java.awt.*;
import java.awt.event.*;
/**
 * View class for the user interface where the GUI buttons are defined.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class MyButtons
extends Panel
implements ActionListener
{
    // instance variables
    Button button1, button2, button3;
    GUI gui;
    randomColor randomizer;

    /**
     * Constructor for objects of class MyButtons
     * 
     * @param Takes a GUI object.
     */
    public MyButtons(GUI gui)
    {
        // initialise instance variables
        this.gui = gui;
        button1 = new Button("Black Moose");
        button2 = new Button("Red Moose");
        button3 = new Button("Trippy Moose");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        randomizer = new randomColor();
    }

    /**
     * Sets the gui color selection based on button input.
     *
     * @param takes an ActionEvent.
     */
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == button1) {
            gui.setColor(Color.BLACK);
        } else if (e.getSource() == button2) {
            gui.setColor(Color.RED);
        } else if (e.getSource() == button3) {
            gui.setColor(randomizer.getColor());
        }
        
    }
}
